package com.appdirect.subscription.api.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.api.model.Account;
import com.appdirect.subscription.business.model.AccountBO;

@Component
public class AccountTranslator {

	public AccountBO translate(Account account, String email) {

		if (null == account) {
			return null;
		}
		AccountBO accountBO = new AccountBO();
		accountBO.setAccountIdentifier(account.getAccountIdentifier());
		accountBO.setStatus(account.getStatus());
		accountBO.setEmail(email);
		return accountBO;
	}
}
