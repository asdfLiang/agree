package com.cm.dal.entity;

import lombok.Data;

/**
 * 合同
 *
 * @author by liangzj
 * @since 2022/8/21 12:12
 */
@Data
public class ContractDO {

    private Long id;

    /** 合同id */
    private String contractId;

    /** 合同文件 */
    private String fileId;

    /** 所属租户 */
    private String tenantId;

    /** 合同来源id */
    private String sourceId;

    /** 合同来源类型：1.模板 2.合同 */
    private Integer sourceType;
}
