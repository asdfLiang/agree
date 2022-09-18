package com.cm.model.dto.contract;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 合同控件
 *
 * @author by liangzj
 * @since 2022/8/13 19:11
 */
@Data
public class StructDTO implements Serializable {

    @Serial private static final long serialVersionUID = -559218452100973035L;

    /** 控件id */
    private String structId;

    /** 所属合同 */
    private String contractId;

    /** 所属协作方id */
    private String cooperationId;

    /** 控件类型 */
    private Integer type;

    /** 控件内容 */
    private String text;
}
