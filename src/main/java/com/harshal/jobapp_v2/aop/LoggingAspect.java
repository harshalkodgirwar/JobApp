package com.harshal.jobapp_v2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
    //the below stars can be replace by return-type class-name.method-name(args)
    @Before("execution(* com.harshal.jobapp_v2.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp){
        logger.info("Method call" + jp.getSignature().getName());
    }

    @After("execution(* com.harshal.jobapp_v2.service.JobService.getJob(..))")
    public void logMethodEx(JoinPoint jp){
        logger.info("Method Executed " + jp.getSignature().getName());
    }
}
