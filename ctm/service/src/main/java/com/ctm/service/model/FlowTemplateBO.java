package com.ctm.service.model;

import com.ctm.model.biz.FlowTemplateConfig;
import com.ctm.model.biz.contract.Contract;
import lombok.Data;

import java.util.List;

/**
 * @author by liangzj
 * @since 2022/8/28 20:19
 */
@Data
public class FlowTemplateBO {

    /** 标题 */
    String title;
    /** 合同模板 */
    List<Contract> contracts;
    /** 抄送人列表 */
    List<String> ccAccounts;
    /** 可见人列表 */
    List<String> visibleAccounts;
    /** 模板配置 */
    private FlowTemplateConfig config;

}
