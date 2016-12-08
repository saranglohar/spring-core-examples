package com.sarya.spring.aspectj.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlAspect {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-xml-aspectj.xml");
		Operation operation = (Operation) context.getBean("opBean");
		System.out.println("calling msg... from main method\n");
		operation.msg();

		System.out.println("------------------------\ncalling validate again...");
		try {
			operation.validate(11);
		} catch (Exception exception) {
			System.out.println(exception);
		}
	}
}
