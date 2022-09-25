package com.ctm.deploy;
/**
 * @author by liangzj
 * @since 2022/9/25 12:53
 */
import org.apiguardian.api.API;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.lang.annotation.*;

import static org.apiguardian.api.API.Status.EXPERIMENTAL;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@API(status = EXPERIMENTAL, since = "5.0")
@ArgumentsSource(JsonArgumentProvider.class)
public @interface JsonFileSource {}
