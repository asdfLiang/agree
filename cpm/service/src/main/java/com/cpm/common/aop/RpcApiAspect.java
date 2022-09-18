package com.cpm.common.aop;

import com.contract.common.exceptions.BaseRuntimeException;
import com.contract.common.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * rpc接口参数
 *
 * @author by liangzj
 * @since 2022/8/14 19:11
 */
@Slf4j
@Aspect
@Component
public class RpcApiAspect {

    @Pointcut("execution(* com.cpm.rpc.*.*(*))")
    public void pointcut() {}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            // 入参校验
            Object[] args = joinPoint.getArgs();

            // 结果封装
            result = joinPoint.proceed();
        } catch (Throwable e) {
            // 异常封装
            result = wrapResult(e);
        } finally {
            // 接口信息统计
            record(joinPoint, result, 0L);
        }

        return result;
    }

    private void record(ProceedingJoinPoint joinPoint, Object result, Long cast) {
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();

        log.info("{}, - cast: {}ms, result: {}", methodName, cast, result);
    }

    private Result wrapResult(Throwable e) {

        if (e instanceof BaseRuntimeException) {
            log.warn("rpc error, message: {}", e.getMessage(), e);
        } else {
            log.warn("system error", e);
        }

        return Result.failed(e.getMessage());
    }
}
