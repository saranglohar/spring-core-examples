package com.sarya.spring.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("execution(* Operation.m*(..))")
	public void k() {
		System.out.println("K method in Aspect declared class ");
	}// pointcut name

	@Before("k()") // applying pointcut on before advice
	public void myadvice(JoinPoint jp)// it is advice (before advice)
	{
		System.out.println("@Before " + jp.getSignature());
	}

	@After("k()") // applying pointcut on after advice
	public void myAfterAdvice(JoinPoint jp)// it is advice (after advice)
	{
		System.out.println("@After  " + jp.getSignature());
	}

	// it is advice(after advice)
	@AfterReturning("k()") // applying pointcut on after advice
	public void myAfterReturning(JoinPoint jp) {
		System.out.println("@AfterReturning After Returning " + jp.getSignature());
	}

	@AfterReturning(pointcut = "execution(* Operation.*(..))", returning = "result")
	public void myadvice(JoinPoint jp, Object result)// it is advice (after
														// returning advice)
	{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@\nadditional concern ");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Result in advice: " + result);
		System.out.println("end of after returning advice...");
	}

	@Around("k()")
	public Object myadvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("@Around Before calling actual method " + pjp.getSignature());
		Object obj = pjp.proceed();
		System.out.println("@Around After calling actual method " + pjp.getSignature());
		return obj;
	}

	@AfterThrowing(pointcut = "execution(* Operation.validate(..))", throwing = "error")
	public void myadvice(JoinPoint jp, Throwable error)// it is advice
	{
		System.out.println("--------------------------------------");
		System.out.println("@AfterThrowing " + jp.getSignature());
		System.out.println("Exception is: " + error);
		System.out.println("end of after throwing advice...");
		System.out.println("--------------------------------------");
	}
}