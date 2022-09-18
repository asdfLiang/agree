package com.cpm.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 发起类型
 *
 * @author by liangzj
 * @since 2022/8/13 13:53
 */
@Getter
@AllArgsConstructor
public enum StartTypeEnum {
    START(1, "直接发起"),
    TEMPLATE_START(2, "模板发起"),
    ;

    private final Integer code;

    private final String desc;
}
