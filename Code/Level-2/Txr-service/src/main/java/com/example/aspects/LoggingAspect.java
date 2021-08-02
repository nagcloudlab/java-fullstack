package com.example.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


// Aspect
@Component
@Aspect
public class LoggingAspect {

    private final static Logger logger = Logger.getLogger("txr-service");

//    // Advice i,e piece functionality to apply at join point
//    @Before("execution(boolean txr(..))")  // pointcut
//    public void logBefore(){
//        logger.info("txr initiated");
//    }
//
//    @AfterReturning("execution(boolean txr(..))")  // pointcut
//    public void logAfterReturning(){
//        logger.info("txr successful");
//    }
//
//    @AfterThrowing(pointcut = "execution(boolean txr(..))",throwing = "e")  // pointcut
//    public void logAfterThrowing(Throwable e){
//        logger.info("txr not successful : "+e.getMessage());
//    }

//    @After("execution(boolean txr(..))")  // pointcut
//    public void logAfter(){
//        logger.info("txr done : ");
//    }


    @Around("execution(boolean com.example.service.TxrServiceImpl.txr(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint){
        logger.info("txr initiated");
        Object obj=null;
        try{
             obj=proceedingJoinPoint.proceed();
            logger.info("txr successful");
        }catch (Throwable e){
            logger.info("txr not successful : "+e.getMessage());
        }
        logger.info("txr done : ");
        return obj;
    }


}
