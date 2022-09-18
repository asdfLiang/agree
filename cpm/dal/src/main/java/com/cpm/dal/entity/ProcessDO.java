package com.cpm.dal.entity;

import lombok.Data;

/**
 * @author by liangzj
 * @since 2022/8/14 1:09
 */
@Data
public class ProcessDO {

    /** 流程id */
    private String processId;

    /** 合同标题 */
    private String title;

    /** 来源模板 */
    private String flowTemplateId;

    /** 发起类型 */
    private Integer startType;

    /** 合同配置 */
    private String config;

    /** 流程状态 */
    private Integer status;
}
