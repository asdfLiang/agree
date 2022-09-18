package com.cm.service.impl;

import com.cm.dal.entity.ContractDO;
import com.cm.dal.entity.StructDO;
import com.cm.dal.entity.condition.ContractCondition;
import com.cm.dal.mapper.ContractMapper;
import com.cm.dal.mapper.StructMapper;
import com.cm.model.dto.contract.ContractDTO;
import com.cm.model.dto.contract.StructDTO;
import com.cm.service.ContractService;
import com.contract.common.tools.Copier;
import com.contract.common.tools.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author by liangzj
 * @since 2022/8/23 0:55
 */
@Service
public class ContractServiceImpl implements ContractService {
    @Autowired ContractMapper contractMapper;
    @Autowired StructMapper structMapper;

    @Override
    public List<ContractDTO> create(List<ContractDTO> contracts) {
        // 填充contractId
        contracts.forEach(this::fillContractId);

        // 保存合同
        List<ContractDO> contractDOS =
                contracts.stream()
                        .map(dto -> Copier.copy(dto, ContractDO.class))
                        .collect(Collectors.toList());
        contractMapper.insertBatch(contractDOS);

        // 保存控件
        List<StructDO> structDOS =
                contracts.stream()
                        .map(ContractDTO::getStructs)
                        .filter(ls -> !CollectionUtils.isEmpty(ls))
                        .flatMap(Collection::stream)
                        .filter(Objects::nonNull)
                        .map(dto -> Copier.copy(dto, StructDO.class))
                        .collect(Collectors.toList());
        if (!CollectionUtils.isEmpty(structDOS)) {
            structMapper.insertBatch(structDOS);
        }

        return contractDOS.stream()
                .map(ContractDO::getContractId)
                .map(this::get)
                .collect(Collectors.toList());
    }

    @Override
    public void confirmStructs(List<StructDTO> structs) {
        Map<Boolean, List<StructDTO>> createdMap =
                structs.stream()
                        .collect(Collectors.groupingBy(x -> StringUtils.isBlank(x.getStructId())));

        List<StructDTO> createList = createdMap.get(true);
        List<StructDTO> updateList = createdMap.get(false);

        // 添加控件
        if (!CollectionUtils.isEmpty(createList)) {
            structMapper.insertBatch(
                    createList.stream()
                            .map(x -> Copier.copy(x, StructDO.class))
                            .collect(Collectors.toList()));
        }

        // 更新控件
        if (!CollectionUtils.isEmpty(updateList)) {
            updateList.forEach(
                    struct -> {
                        StructDO update = new StructDO();
                        update.setStructId(struct.getStructId());
                        update.setCooperationId(struct.getCooperationId());
                        structMapper.updateByStructId(update);
                    });
        }
    }

    @Override
    public List<ContractDTO> list(String sourceId, Integer sourceType) {
        // 查询合同
        ContractCondition condition = new ContractCondition();
        condition.setSourceId(sourceId);
        condition.setSourceType(sourceType);
        List<ContractDO> contractDOS = contractMapper.selectByCondition(condition);
        if (CollectionUtils.isEmpty(contractDOS)) {
            return Collections.emptyList();
        }

        // 查询控件,按所属合同分组
        Map<String, List<StructDTO>> contractStructMap =
                mGetStruct(
                        contractDOS.stream()
                                .map(ContractDO::getContractId)
                                .collect(Collectors.toList()));

        return contractDOS.stream()
                .map(x -> Copier.copy(x, ContractDTO.class))
                .peek(dto -> dto.setStructs(contractStructMap.get(dto.getContractId())))
                .collect(Collectors.toList());
    }

    @Override
    public ContractDTO get(String contractId) {
        ContractDO contractDO = contractMapper.select(contractId);
        if (Objects.isNull(contractDO)) {
            return null;
        }

        ContractDTO dto = Copier.copy(contractDO, ContractDTO.class);
        dto.setStructs(mGetStruct(Collections.singletonList(contractId)).get(contractId));
        return dto;
    }

    /**
     * 获取合同控件，按照合同分组
     *
     * @param contractIds 合同id列表
     * @return Map<contractId, List<StructDTO>>
     */
    private Map<String, List<StructDTO>> mGetStruct(List<String> contractIds) {
        List<StructDO> structDOS = structMapper.list(contractIds);
        if (CollectionUtils.isEmpty(structDOS)) {
            return Collections.emptyMap();
        }

        return structDOS.stream()
                .collect(
                        Collectors.groupingBy(
                                StructDO::getContractId,
                                Collectors.mapping(
                                        x -> Copier.copy(x, StructDTO.class),
                                        Collectors.toList())));
    }

    private void fillContractId(ContractDTO contractDTO) {
        String contractId = UUIDUtil.getNonBreak();

        contractDTO.setContractId(contractId);

        List<StructDTO> structs = contractDTO.getStructs();
        if (!CollectionUtils.isEmpty(structs)) {
            structs.forEach(struct -> struct.setContractId(contractId));
        }
    }
}
