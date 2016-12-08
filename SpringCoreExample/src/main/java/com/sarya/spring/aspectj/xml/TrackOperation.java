package com.sarya.spring.aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation {

	public void myBeforeAdvice(JoinPoint jp)// it is advice
	{
		System.out.println("Before actual method call " + jp.getSignature());
		// System.out.println("Method Signature: " + );
	}

	public void myAfterAdvice(JoinPoint jp) {
		System.out.println("After actual method call " + jp.getSignature());
	}

	public void myAfterReturningAdvice(JoinPoint jp, Object result) {
		System.out.println("After returning actual method call " + jp.getSignature() + result);
	}

	public Object myAroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Before calling actual method " + pjp.getSignature());
		Object obj = pjp.proceed();
		System.out.println("Around After calling actual method " + pjp.getSignature());
		return obj;
	}

	public void myThrowingAdvice(JoinPoint jp, Throwable error)// it is advice
	{
		System.out.println("--------------------------------------");
		System.out.println("@AfterThrowing " + jp.getSignature());
		System.out.println("Exception is: " + error);
		System.out.println("end of after throwing advice...");
		System.out.println("--------------------------------------");
	}
}
