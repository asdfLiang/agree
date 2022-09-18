package com.cm.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 合同来源
 *
 * @author by liangzj
 * @since 2022/8/30 22:57
 */
@Getter
@AllArgsConstructor
public enum SourceType {
    FLOW_TEMPLATE(1, "流程模板"),
    PROCESS(2, "合同流程"),
    ;

    private final Integer code;

    private final String desc;
}
