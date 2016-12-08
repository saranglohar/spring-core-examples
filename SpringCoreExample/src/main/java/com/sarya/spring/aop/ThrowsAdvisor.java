/**
 * 
 */
package com.sarya.spring.aop;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author Sarang Lohar
 *
 */
public class ThrowsAdvisor implements ThrowsAdvice {

	/**
	 * 
	 */
	public ThrowsAdvisor() {
		// TODO Auto-generated constructor stub
	}

	public void afterThrowing(Exception ex) {
		System.out.println("additional concern if exception occurs");
	}

}
