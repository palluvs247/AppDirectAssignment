package com.appdirect.subscription.business.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appdirect.subscription.business.exception.AccountNotFoundException;
import com.appdirect.subscription.business.exception.UserAlreadyExistsException;
import com.appdirect.subscription.business.model.SubscriptionBO;
import com.appdirect.subscription.dao.entity.CustomerAccount;
import com.appdirect.subscription.dao.facade.SubscriptionDaoFacade;

@Component
public class SubscriptionValidator {

	@Autowired
	SubscriptionDaoFacade subscriptionDaoFacade;
	
	
	public void validateCreateSubscriptionRequest(SubscriptionBO subscriptionDO) {
		validateUserAlreadyExist(subscriptionDO.getAccountBO().getEmail());
	}
	
	private void validateUserAlreadyExist(String emailId) {
		CustomerAccount customerAccount = subscriptionDaoFacade.getCustomerAccountRepository().findByEmail(emailId);
		if (null != customerAccount) {
			throw new UserAlreadyExistsException();
		}
	}

	public void validateUpdateSubscriptionRequest(SubscriptionBO subscriptionDO) {
		checkAccount(subscriptionDO.getAccountBO().getEmail() , subscriptionDO.getAccountBO().getAccountIdentifier());
	}
	
	private void checkAccount(String emailId, String accountId) {
		CustomerAccount customerAccount = subscriptionDaoFacade.getCustomerAccountRepository().findByEmail(emailId);
		if (null == customerAccount || !accountId.equals(customerAccount.getAccountIdentifier())) {
			throw new AccountNotFoundException();
		}
	}
}
