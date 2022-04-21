package com.yeahbutstill.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
@Aspect
// Configuration
@Configuration
public class BeforeAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls I would intercept
    // execution(* PACKAGE.*.*(..))
    // semua jenis return type, paket tertentu, semua class, semua method, terlepas dari argument
    @Before("execution(* com.yeahbutstill.spring.aop.springaop.business.*.*(..))")
    public void before(JoinPoint joinPoint) {
        // What to do?
        logger.info("Intercepted Method Calls - {}", joinPoint);
    }

}
