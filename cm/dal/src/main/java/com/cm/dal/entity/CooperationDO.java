package com.cm.dal.entity;

import lombok.Data;

/**
 * 协作方
 *
 * @author by liangzj
 * @since 2022/8/13 14:07
 */
@Data
public class CooperationDO {

    private Long id;

    /** 协作方id */
    private String cooperationId;

    /** 协作方类型：1.企业 2.个人 */
    private Integer type;

    /** 签署方式 */
    private String signMethods;

    /** 意愿认证方式 */
    private String willAuthMethods;
}
