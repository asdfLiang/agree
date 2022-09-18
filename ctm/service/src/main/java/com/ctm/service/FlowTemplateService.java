package com.ctm.service;

import com.ctm.model.FlowTemplateDTO;

/**
 * 流程模板服务
 *
 * @author by liangzj
 * @since 2022/8/28 15:20
 */
public interface FlowTemplateService {

    /**
     * 创建流程模板
     *
     * @param flowTemplateDTO
     */
    void create(FlowTemplateDTO flowTemplateDTO);
}
