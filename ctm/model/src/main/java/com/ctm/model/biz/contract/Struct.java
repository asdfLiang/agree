package com.ctm.model.biz.contract;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 合同控件
 *
 * @author by liangzj
 * @since 2022/8/13 19:11
 */
@Data
public class Struct {

    /** 控件id */
    private String structId;

    /** 所属合同 */
    private String contractId;

    /** 绑定的协作方 */
    private String cooperationId;

    /** 控件类型 */
    @NotBlank private Integer type;

    /** 控件内容 */
    private String text;
}
