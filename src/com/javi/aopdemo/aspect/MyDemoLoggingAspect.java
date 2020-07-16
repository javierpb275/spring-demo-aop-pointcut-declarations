package com.javi.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	@Pointcut("execution(* com.javi.aopdemo.dao.*.*(..))")//create pointcut declaration
	private void forDaoPackage() {
		
	}
	
	@Before("forDaoPackage()")//apply pointcut declaration to advice
	public void beforeAddAccountAdvice() {
		 
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>>> Performing API analytics");
	}

}
