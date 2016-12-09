package com.sarya.spring.data.jpa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarya.spring.data.jpa.AccountDao;

public class TestSpringJpaExample {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-jpa\\applicationContext.xml");
		AccountDao accountsDao = context.getBean("accountsDaoBean", AccountDao.class);

		// accountsDao.createAccount(0, "Jai Kumar", 41000);
		// accountsDao.createAccount(20, "Rishi ", 35000);
		System.out.println("Accounts created");

		// accountsDao.updateBalance(20, 50000);
		// System.out.println("Account balance updated");

		List<Account> accounts = accountsDao.getAllAccounts();
		for (int i = 0; i < accounts.size(); i++) {
			Account acc = accounts.get(i);
			System.out.println(acc.getAccountNumber() + " : " + acc.getOwner() + " (" + acc.getBalance() + ")");
		}

		// accountsDao.deleteAccount(111);
		// System.out.println("Account deleted");
	}

}
