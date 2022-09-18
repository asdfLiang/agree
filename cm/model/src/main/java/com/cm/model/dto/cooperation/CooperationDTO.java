package com.cm.model.dto.cooperation;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * 协作方
 *
 * @author by liangzj
 * @since 2022/8/13 14:07
 */
@Data
public class CooperationDTO implements Serializable {

    @Serial private static final long serialVersionUID = -3914530032397616912L;

    /** 参与人列表 */
    List<CooperatorDTO> cooperators;
    /** 协作方id */
    private String cooperationId;
    /** 协作方类型：1.个人 2.企业 */
    private Integer type;
    /** 签署方式 */
    private List<Integer> signMethods;
    /** 意愿认证方式 */
    private List<Integer> willAuthMethods;
}
