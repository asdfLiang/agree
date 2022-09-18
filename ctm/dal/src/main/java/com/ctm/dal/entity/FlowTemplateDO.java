package com.ctm.dal.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author by liangzj
 * @since 2022/8/28 17:23
 */
@Data
public class FlowTemplateDO {

    private Long id;

    /** 模板标题 */
    private String title;

    private String flowTemplateId;

    /** 是否保密 */
    private Integer secret;

    /** 合同到期时间 */
    private Date expireDate;

    /** 签署截止时间 */
    private Date signDeadLine;
}
