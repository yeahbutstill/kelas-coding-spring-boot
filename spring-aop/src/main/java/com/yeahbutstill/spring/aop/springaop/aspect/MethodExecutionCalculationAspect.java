package com.yeahbutstill.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// membiarkan metode untuk menlanjutkan dan kemudian menemukan waktu yang diperlukan
	@Around("com.yeahbutstill.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		// startTime = x
		long startTime = System.currentTimeMillis();

		// allow execution of method
		Object returnProceed = joinPoint.proceed();

		// end time = y
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by {} is {}", joinPoint, timeTaken);

		return returnProceed;
	}
}
