package com.contract.common.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 通用异常
 *
 * @author by liangzj
 * @since 2022/8/14 22:25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseRuntimeException extends RuntimeException {
    private String code;
    private String message;
}
