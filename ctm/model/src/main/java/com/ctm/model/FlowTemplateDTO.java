package com.ctm.model;

import com.ctm.model.biz.FlowTemplateConfig;
import com.ctm.model.biz.contract.Contract;
import com.ctm.model.biz.contract.Cooperation;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 合同流程模板
 *
 * @author by liangzj
 * @since 2022/8/14 11:03
 */
@Data
public class FlowTemplateDTO implements Serializable {

    @Serial private static final long serialVersionUID = -288326944451759543L;
    /** 合同模板 */
    @NotEmpty List<Contract> contracts;
    /** 流程协作方 */
    @NotEmpty List<Cooperation> cooperations;
    /** 标题 */
    @NotBlank private String title;
    /** 抄送人列表 */
    private List<String> ccAccounts;
    /** 可见人列表 */
    private List<String> visibleAccounts;
    /** 模板配置 */
    private FlowTemplateConfig config;
}
