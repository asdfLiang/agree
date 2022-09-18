package com.contract.common.tools;

import org.springframework.beans.BeanUtils;

/**
 * @author by liangzj
 * @since 2022/9/9 23:50
 */
public class Copier {

    public static <T> T copy(Object source, Class<T> targetType) {
        try {
            T t = targetType.getDeclaredConstructor().newInstance();
            BeanUtils.copyProperties(source, t);
            return t;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
