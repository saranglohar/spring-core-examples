/**
 * 
 */
package com.sarya.spring.data.jpa;

/**
 * @author Sarang Lohar
 *
 */
public class Account {

	private int accountNumber;
	private String owner;
	private double balance;

	Account() {

	}

	Account(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}

	Account(int accountNumber, String owner, double balance) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
