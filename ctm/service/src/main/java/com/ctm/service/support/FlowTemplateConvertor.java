package com.ctm.service.support;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.cm.model.dto.contract.ContractDTO;
import com.ctm.dal.entity.FlowTemplateDO;
import com.ctm.model.FlowTemplateDTO;
import com.ctm.service.model.FlowTemplateBO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author by liangzj
 * @since 2022/8/28 21:30
 */
@Component
public class FlowTemplateConvertor {

    public FlowTemplateBO getBO(FlowTemplateDTO flowTemplateDTO) {
        FlowTemplateBO flowTemplateBO = new FlowTemplateBO();
        BeanUtils.copyProperties(flowTemplateDTO, flowTemplateBO);

        return flowTemplateBO;
    }

    public FlowTemplateDO getFlowTemplateDO(FlowTemplateBO bo) {
        FlowTemplateDO flowTemplateDO = new FlowTemplateDO();
        BeanUtils.copyProperties(bo, flowTemplateDO);
        Optional.ofNullable(bo.getConfig())
                .ifPresent(config -> BeanUtils.copyProperties(config, flowTemplateDO));

        return flowTemplateDO;
    }

    public List<ContractDTO> getContractDTOS(FlowTemplateBO bo) {
        return bo.getContracts().stream()
                .map(JSON::toJSONString)
                .map(json -> JSONObject.parseObject(json, ContractDTO.class))
                .collect(Collectors.toList());
    }
}
