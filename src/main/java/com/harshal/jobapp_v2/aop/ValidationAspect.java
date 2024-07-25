package com.harshal.jobapp_v2.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    private static final Logger logger = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.harshal.jobapp_v2.service.JobService.getJob(..)) && args(postid)")
    public Object validateAndUpdate(ProceedingJoinPoint jp, int postid) throws Throwable {
        if(postid < 0)
        {
            logger.info("Post id is negative");
            postid = -postid;
        }
        Object obj = jp.proceed(new Object[]{postid});
        return obj;
    }


}
