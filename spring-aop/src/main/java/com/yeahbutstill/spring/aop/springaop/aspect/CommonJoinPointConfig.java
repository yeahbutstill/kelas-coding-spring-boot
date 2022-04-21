package com.yeahbutstill.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.yeahbutstill.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution(){}
	
	@Pointcut("execution(* com.yeahbutstill.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution(){}
	
	@Pointcut("dataLayerExecution() && businessLayerExecution()")
	public void allLayerExecution(){}
	
	// Semua pemanggilan metode pada entity yang mengandung dao dalam nama dicocokkan dengan pointcut
	@Pointcut("bean(*dao*)")
	public void beanContainingDao(){}

	// Hati-hati dengan tanda kurung tutup saat menentukan pointcuts
	@Pointcut("within(com.yeahbutstill.spring.aop.springaop.data..*)")
	public void dataLayerExecutionWithWithin(){}

	@Pointcut("@annotation(com.yeahbutstill.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnnotation(){}

}
