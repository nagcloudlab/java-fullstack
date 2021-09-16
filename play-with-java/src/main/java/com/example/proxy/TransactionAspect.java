package com.example.proxy;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class TransactionAspect {

    @Around(value = "execution(void useCase*())")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        try {
            log.info("begin txn");
            proceedingJoinPoint.proceed();
            log.info("commit txn");
        }catch (Throwable e){
            log.info("rollback txn");
        }finally {
            log.info("close txn resources");
        }
    }

}
