package com.ctm.deploy.controller;

import com.contract.common.result.Result;
import com.ctm.deploy.vo.FlowTemplateVO;
import com.ctm.model.FlowTemplateDTO;
import com.ctm.service.FlowTemplateService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by liangzj
 * @since 2022/8/28 21:21
 */
@RestController
@RequestMapping("/flow-template")
public class FlowTemplateController {

    @Autowired private FlowTemplateService flowTemplateService;

    @PostMapping("/create")
    public Result create(@RequestBody FlowTemplateVO vo) {

        // 入参转换
        FlowTemplateDTO flowTemplate = new FlowTemplateDTO();
        BeanUtils.copyProperties(vo, flowTemplate);

        flowTemplateService.create(flowTemplate);

        return Result.success();
    }
}
