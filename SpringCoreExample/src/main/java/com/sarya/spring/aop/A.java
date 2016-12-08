/**
 * 
 */
package com.sarya.spring.aop;

/**
 * @author Sarang Lohar
 *
 */
public class A {

	/**
	 * 
	 */
	public A() {
		// TODO Auto-generated constructor stub
	}

	public String m(String name) {
		System.out.println("------------------------------------------");
		System.out.println("actual business logic");
		// int a = 10/0;
		System.out.println("------------------------------------------");
		return name;
	}

	public void validate(int age) throws Exception {
		if (age < 18) {
			throw new ArithmeticException("Not Valid Age");
		} else {
			System.out.println("vote confirmed");
		}
	}
}
