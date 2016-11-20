package com.appdirect.subscription.business.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.business.model.AccountBO;
import com.appdirect.subscription.dao.entity.CustomerAccount;

@Component
public class CustomerAccountTranslator {

	public CustomerAccount translate(AccountBO accountBO) {

		if (null == accountBO) {
			return null;
		}
		CustomerAccount customerAccount = new CustomerAccount();
		customerAccount.setAccountIdentifier(accountBO.getAccountIdentifier());
		customerAccount.setStatus(accountBO.getStatus());
		customerAccount.setEmail(accountBO.getEmail());
		return customerAccount;
	}

	public AccountBO translate(CustomerAccount customerAccount) {
		if (null == customerAccount) {
			return null;
		}
		AccountBO accountBO = new AccountBO();
		accountBO.setAccountIdentifier(accountBO.getAccountIdentifier());
		accountBO.setStatus(accountBO.getStatus());
		accountBO.setEmail(accountBO.getEmail());
		return accountBO;
	}
	
}
