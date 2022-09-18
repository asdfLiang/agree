package com.contract.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 通用返回值
 *
 * @author by liangzj
 * @since 2022/8/14 19:09
 */
@Data
@AllArgsConstructor
public class Result<T> {

    private Boolean success;
    private T data;
    private String message;

    public static Result success() {
        return new Result(true, null, null);
    }

    public static Result success(Object data) {
        return new Result(true, data, null);
    }

    public static Result failed(String message) {
        return new Result(false, null, message);
    }
}
