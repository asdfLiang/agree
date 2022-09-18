package com.ctm.service.impl;

import com.cm.client.service.ContractClient;
import com.cm.client.service.CooperationClient;
import com.cm.model.dto.contract.ContractDTO;
import com.cm.model.dto.contract.StructDTO;
import com.cm.model.dto.cooperation.CooperationDTO;
import com.cm.model.dto.cooperation.CooperatorDTO;
import com.cm.model.enums.SourceType;
import com.contract.common.tools.Copier;
import com.contract.common.tools.UUIDUtil;
import com.ctm.dal.entity.FlowTemplateDO;
import com.ctm.dal.mapper.FlowTemplateMapper;
import com.ctm.model.FlowTemplateDTO;
import com.ctm.model.biz.contract.Contract;
import com.ctm.model.biz.contract.Cooperation;
import com.ctm.service.FlowTemplateService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author by liangzj
 * @since 2022/8/28 15:35
 */
@Service
public class FlowTemplateServiceImpl implements FlowTemplateService {

    @Autowired private FlowTemplateMapper flowTemplateMapper;

    @DubboReference private ContractClient contractClient;

    @DubboReference private CooperationClient cooperationClient;

    @Transactional
    @Override
    public void create(FlowTemplateDTO flowTemplateDTO) {
        // 保存模板信息
        FlowTemplateDO flowTemplateDO = Copier.copy(flowTemplateDTO, FlowTemplateDO.class);
        BeanUtils.copyProperties(flowTemplateDTO.getConfig(), flowTemplateDO);
        flowTemplateDO.setFlowTemplateId(UUIDUtil.getNonBreak());
        flowTemplateMapper.insert(flowTemplateDO);

        // 保存合同信息
        List<ContractDTO> contractDTOS =
                flowTemplateDTO.getContracts().stream()
                        .map(this::buildContractDTO)
                        .peek(
                                dto -> {
                                    dto.setSourceId(flowTemplateDO.getFlowTemplateId());
                                    dto.setSourceType(SourceType.FLOW_TEMPLATE.getCode());
                                })
                        .collect(Collectors.toList());
        contractClient.create(contractDTOS);

        // 保存协作方信息
        List<CooperationDTO> cooperationDTOS =
                flowTemplateDTO.getCooperations().stream()
                        .map(this::buildCooperationDTO)
                        .collect(Collectors.toList());
        cooperationClient.create(cooperationDTOS);
    }

    private ContractDTO buildContractDTO(Contract contract) {
        ContractDTO dto = Copier.copy(contract, ContractDTO.class);
        dto.setStructs(
                contract.getStructs().stream()
                        .map(struct -> Copier.copy(struct, StructDTO.class))
                        .collect(Collectors.toList()));

        return dto;
    }

    private CooperationDTO buildCooperationDTO(Cooperation cooperation) {
        CooperationDTO dto = Copier.copy(cooperation, CooperationDTO.class);
        dto.setCooperators(
                cooperation.getCooperators().stream()
                        .map(cooperator -> Copier.copy(cooperator, CooperatorDTO.class))
                        .collect(Collectors.toList()));
        return dto;
    }
}
