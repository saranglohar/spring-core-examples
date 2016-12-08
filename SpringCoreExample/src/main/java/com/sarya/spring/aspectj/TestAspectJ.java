/**
 * 
 */
package com.sarya.spring.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Sarang Lohar
 *
 */
public class TestAspectJ {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aspectj.xml");
		Operation operation = (Operation) context.getBean("opBean");
		System.out.println("calling msg... from main");
		operation.msg();
		operation.k();

		System.out.println("------------------------\ncalling validate...");
		try {
			operation.validate(19);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("------------------------\ncalling validate again...");
		try {
			operation.validate(11);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

}
