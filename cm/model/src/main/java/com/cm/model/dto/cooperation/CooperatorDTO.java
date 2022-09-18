package com.cm.model.dto.cooperation;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 协作者
 *
 * @author by liangzj
 * @since 2022/8/13 14:08
 */
@Data
public class CooperatorDTO implements Serializable {

    @Serial private static final long serialVersionUID = 8867514801110546173L;

    /** 协作者id */
    private String cooperatorId;

    /** 所属参与方 */
    private String cooperationId;

    /** 参与人 */
    private String userId;

    /** 所属企业 */
    private String tenantId;
}
