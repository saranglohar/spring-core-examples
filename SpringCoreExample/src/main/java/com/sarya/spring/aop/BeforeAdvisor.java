/**
 * 
 */
package com.sarya.spring.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author Sarang Lohar
 *
 */
public class BeforeAdvisor implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor {

	/**
	 * 
	 */
	public BeforeAdvisor() {

	}

	// Method Before Advice
	public void before(Method method, Object[] args, Object target) throws Throwable {

		System.out.println("Method before actual logic");
		/*
		 * System.out.println("method info:" + method.getName() + " " +
		 * method.getModifiers()); System.out.println("argument info:"); for
		 * (Object arg : args) System.out.println(arg); System.out.println(
		 * "target Object:" + target); System.out.println(
		 * "target object class name: " + target.getClass().getName());
		 */
	}

	// After Returning Advice
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

		System.out.println("method after returning advice");
	}

	// Method Interceptor
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj;
		System.out.println("Interceptor before actual logic");
		obj = invocation.proceed();
		System.out.println("Interceptor after actual logic");
		return obj;
	}

}
