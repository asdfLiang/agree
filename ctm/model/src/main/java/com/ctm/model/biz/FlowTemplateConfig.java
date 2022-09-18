package com.ctm.model.biz;

import lombok.Data;

import java.util.Date;

/**
 * 模板配置
 *
 * @author by liangzj
 * @since 2022/8/28 23:42
 */
@Data
public class FlowTemplateConfig {
    /** 是否保密 */
    private Integer secret;

    /** 合同到期时间 */
    private Date expireDate;

    /** 签署截止时间 */
    private Date signDeadLine;
}
