package com.library.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Aswin Senthilkumar
 *
 */

@Aspect
@Component
public class LoggingAspect {

	
@Before("execution(*   com.library.service.*.displayService(..))")
public void beforeLogger() {
	System.out.println("AOP logging for Display Service Started...");
}

@Pointcut("execution(* com.library.service.*.displayService(..))")
public void authLogger() {
	
}

@AfterReturning(pointcut = "authLogger()" , returning= "returnValue" )
public void aspectReturning( JoinPoint jp , Object returnValue) {
	System.out.println("[ Auth Logger ] authenticated as : " +  returnValue);
}

@After("execution(* com.library.service.*.displayService(..))")
public void afterLogger() {
	System.out.println("AOP logging for Display Service Ended...");
}

}
