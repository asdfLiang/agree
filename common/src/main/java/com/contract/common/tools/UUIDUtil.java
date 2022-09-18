package com.contract.common.tools;

import java.util.UUID;

/**
 * @author by liangzj
 * @since 2022/8/27 22:04
 */
public class UUIDUtil {

    public static String getNonBreak() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
