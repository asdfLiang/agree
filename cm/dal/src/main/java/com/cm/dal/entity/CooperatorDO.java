package com.cm.dal.entity;

import lombok.Data;

/**
 * 协作者
 *
 * @author by liangzj
 * @since 2022/8/21 12:25
 */
@Data
public class CooperatorDO {

    private Long id;

    /** 协作者id */
    private String cooperatorId;

    /** 所属协作方 */
    private String cooperationId;

    /** 协作者id */
    private String userId;

    /** 所属租户 */
    private String tenantId;
}
