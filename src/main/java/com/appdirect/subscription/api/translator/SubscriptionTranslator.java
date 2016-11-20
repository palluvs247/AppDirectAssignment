package com.appdirect.subscription.api.translator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appdirect.subscription.api.factory.AccountFactory;
import com.appdirect.subscription.api.model.Account;
import com.appdirect.subscription.api.model.Creator;
import com.appdirect.subscription.api.model.Order;
import com.appdirect.subscription.api.model.Payload;
import com.appdirect.subscription.api.model.Subscription;
import com.appdirect.subscription.business.model.AccountBO;
import com.appdirect.subscription.business.model.AddressBO;
import com.appdirect.subscription.business.model.CompanyBO;
import com.appdirect.subscription.business.model.ItemBO;
import com.appdirect.subscription.business.model.OrderBO;
import com.appdirect.subscription.business.model.SubscriptionBO;

@Component
public class SubscriptionTranslator {

	private static final String ACTIVE = "ACTIVE";
	private static final String SUBSCRIPTION_ORDER = "SUBSCRIPTION_ORDER";
	@Autowired
	CompanyTranslator companyTranslator;
	@Autowired
	OrderTranslator orderTranslator;
	@Autowired
	AccountFactory accountFactory;
	@Autowired
	AddressTranslator addressTranslator;
	@Autowired
	ItemTranslator itemTranslator;
	@Autowired
	AccountTranslator accountTranslator;

	public SubscriptionBO translate(Subscription subscription) {

		SubscriptionBO subscriptionBO = new SubscriptionBO();

		Payload payload = subscription.getPayload();
		Order order = payload.getOrder();
		Creator creator = subscription.getCreator();
				
		CompanyBO companyBO = companyTranslator.translate(payload.getCompany());
		ItemBO itemBO = itemTranslator.translate(order.getItem());
		OrderBO orderBO = orderTranslator.translate(order,itemBO);
		
		AccountBO accountBO = null;
		Account account = payload.getAccount();
		if (SUBSCRIPTION_ORDER.equals(subscription.getType())){
			accountBO = accountFactory.create(account,creator.getEmail() ,ACTIVE);
		}else{
			accountBO = accountTranslator.translate(account, creator.getEmail());
		}
		
		
		AddressBO addressBO = addressTranslator.translate(creator.getAddress());
		
		subscriptionBO.setRequestType(subscription.getType());
		subscriptionBO.setCompanyBO(companyBO);
		subscriptionBO.setAddressBO(addressBO);
		subscriptionBO.setOrderBO(orderBO);
		subscriptionBO.setItemBO(itemBO);
		subscriptionBO.setAccountBO(accountBO);
		
/*		subscriptionBO.setCustomerCompany(customerCompany);
		subscriptionBO.setCustomerOrder(customerOrder);
		subscriptionBO.setCustomerAccount(customerAccount);
		subscriptionBO.setCustomerItem(customerItem);
		subscriptionBO.setCustomerAddress(customerAddress);*/
		return subscriptionBO;
	}
}
