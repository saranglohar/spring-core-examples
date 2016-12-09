/**
 * 
 */
package com.sarya.spring.data.jpa;

import java.util.List;

import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Sarang Lohar
 *
 */

@Transactional
public class AccountDao {
	JpaTemplate template;

	public void setTemplate(JpaTemplate template) {
		this.template = template;
	}

	public void createAccount(int accountNumber, String owner, double balance) {
		Account account = new Account(owner, balance);
		template.persist(account);
	}

	public void updateBalance(int accountNumber, double newBalance) {
		Account account = template.find(Account.class, accountNumber);
		if (account != null) {
			account.setBalance(newBalance);
		}
		template.merge(account);
	}

	public void deleteAccount(int accountNumber) {
		Account account = template.find(Account.class, accountNumber);
		if (account != null)
			template.remove(account);
	}

	public List<Account> getAllAccounts() {
		List<Account> accounts = template.find("select acc from Account acc");
		return accounts;
	}

}
