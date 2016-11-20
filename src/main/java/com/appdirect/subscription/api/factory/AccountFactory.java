package com.appdirect.subscription.api.factory;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.api.model.Account;
import com.appdirect.subscription.business.model.AccountBO;

@Component
public class AccountFactory {

	
	public AccountBO create(Account account, String email ,String status) {
		AccountBO accountBO = new AccountBO();
		accountBO.setStatus(status);
		accountBO.setAccountIdentifier(UUID.randomUUID().toString());
		accountBO.setEmail(email);
		return accountBO;
	}
}
