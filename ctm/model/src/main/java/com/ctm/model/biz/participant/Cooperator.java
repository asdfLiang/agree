package com.ctm.model.biz.participant;

import lombok.Data;

/**
 * 协作者
 *
 * @author by liangzj
 * @since 2022/8/13 14:08
 */
@Data
public class Cooperator {

    /** 所属参与方 */
    private String cooperationId;

    /** 参与人 */
    private String userId;

    /** 所属企业 */
    private String tenantId;

    /** 账号类型：1.个人 2.企业 */
    private Integer accountType;
}
