/**
 * 
 */
package com.sarya.spring.aspectj;

/**
 * @author Sarang Lohar
 *
 */
class Operation {

	/**
	 * 
	 */
	public Operation() {
		// TODO Auto-generated constructor stub
	}

	public void msg() {
		System.out.println("____________________\n msg method invoked\n------------------");
	}

	public int m() {
		System.out.println("____________________\n m method invoked\n-----------------");
		return 2;
	}

	public int k() {
		System.out.println("____________________\n k method invoked\n-------------------");
		return 3;
	}

	public void validate(int age) throws Exception {
		if (age < 18) {
			throw new ArithmeticException("Not valid age");
		} else {
			System.out.println("Thanks for vote");
		}
	}

}
