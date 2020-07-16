package com.javi.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice
	
	@Pointcut("execution(* com.javi.aopdemo.dao.*.*(..))")//create pointcut declaration
	private void forDaoPackage() {
		
	}
	
	@Before("forDaoPackage()")//apply pointcut declaration to advice
	public void beforeAddAccountAdvice() {
		 
		
		
		// Add our custom code (that will be run BEFORE that given method)
		
		System.out.println("\n=======>>>>>> Executing @Before advice on addAccount()");
		
	}

}
