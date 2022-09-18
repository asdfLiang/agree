package com.cm.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author by liangzj
 * @since 2022/8/27 22:46
 */
@Getter
@AllArgsConstructor
public enum CooperationTypeEnum {
    USER(1, "个人"),
    TENANT(2, "企业"),
    ;

    private final Integer code;

    private final String desc;
}
