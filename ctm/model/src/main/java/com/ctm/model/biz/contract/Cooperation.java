package com.ctm.model.biz.contract;

import com.ctm.model.biz.participant.Cooperator;
import lombok.Data;

import java.util.List;

/**
 * 协作方
 *
 * @author by liangzj
 * @since 2022/8/13 14:07
 */
@Data
public class Cooperation {

    /** 参与人列表 */
    List<Cooperator> cooperators;
    /** 协作方id */
    private String cooperationId;
    /** 协作方类型：1.个人 2.企业 */
    private Integer type;
    /** 签署方式 */
    private List<Integer> signMethods;
    /** 意愿认证方式 */
    private List<Integer> willAuthMethods;

    /** 协作方控件 */
    private List<Struct> structs;
}
