package com.ctm.service.manager;

import com.cm.client.service.ContractClient;
import com.cm.model.dto.contract.ContractDTO;
import com.cm.model.enums.SourceType;
import com.ctm.dal.entity.FlowTemplateDOExample;
import com.ctm.dal.mapper.FlowTemplateMapper;
import com.ctm.service.model.FlowTemplateBO;
import com.ctm.service.support.FlowTemplateConvertor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author by liangzj
 * @since 2022/8/28 19:49
 */
@Repository
public class FlowTemplateManager {
    @Autowired private FlowTemplateMapper flowTemplateMapper;

    @Autowired private FlowTemplateConvertor convertor;
    @DubboReference private ContractClient contractClient;

    public void save(FlowTemplateBO flowTemplateBO) {

    }

    public FlowTemplateBO get(String flowTemplateId) {
        // 获取流程模板
        FlowTemplateDOExample example = new FlowTemplateDOExample();
        example.createCriteria().andFlowTemplateIdEqualTo(flowTemplateId);
        flowTemplateMapper.selectByExample(example);

        // 获取合同列表
        List<ContractDTO> contractDTOS =
                contractClient.listBySource(flowTemplateId, SourceType.FLOW_TEMPLATE.getCode());

        // 获取参与人

        return null;
    }
}
