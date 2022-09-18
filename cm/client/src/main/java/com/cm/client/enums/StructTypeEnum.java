package com.cm.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author by liangzj
 * @since 2022/8/27 22:42
 */
@Getter
@AllArgsConstructor
public enum StructTypeEnum {
    TEXT(1, "文本"),
    SIGN(2, "填写"),
    ;

    private final Integer code;

    private final String desc;
}
