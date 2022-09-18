package com.ctm.deploy.vo;

import com.ctm.model.biz.FlowTemplateConfig;
import com.ctm.model.biz.contract.Contract;
import com.ctm.model.biz.contract.Cooperation;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author by liangzj
 * @since 2022/8/28 21:24
 */
@Data
public class FlowTemplateVO implements Serializable {

    /** 标题 */
    private String title;

    /** 合同模板 */
    private List<Contract> contracts;

    /** 协作方 */
    private List<Cooperation> cooperations;

    /** 抄送人列表 */
    private List<String> ccAccounts;
    /** 可见人列表 */
    private List<String> visibleAccounts;
    /** 模板配置 */
    private FlowTemplateConfig config;
}
