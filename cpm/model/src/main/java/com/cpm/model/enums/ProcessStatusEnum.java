package com.cpm.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * TODO 合同流程状态，不应该放在这里，这是业务属性
 *
 * @author by liangzj
 * @since 2022/8/13 13:44
 */
@Getter
@AllArgsConstructor
public enum ProcessStatusEnum {
    DRAFT(1, "草稿"),
    START(2, "发起"),
    FILL(3, "填写"),
    SIGN(4, "签署"),
    FINISH(5, "完成"),
    REVOKE(6, "撤回"),
    REJECT_FILL(6, "拒填"),
    REJECT_SIGN(7, "拒签"),
    ;

    private final Integer code;

    private final String desc;
}
