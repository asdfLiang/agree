package com.cm.dal.entity;

import lombok.Data;

import java.util.Date;

/**
 * 控件
 *
 * @author by liangzj
 * @since 2022/8/21 12:12
 */
@Data
public class StructDO {

    private Long id;

    private Date createTime;

    private Date updateTime;

    /** 控件id */
    private String structId;

    /** 所属合同 */
    private String contractId;

    /** 控件类型 */
    private Integer type;

    /** 控件内容 */
    private String text;

    /** 控件所属协作方 */
    private String cooperationId;
}
