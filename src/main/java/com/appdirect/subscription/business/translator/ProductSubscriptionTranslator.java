package com.appdirect.subscription.business.translator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appdirect.subscription.business.model.AccountBO;
import com.appdirect.subscription.business.model.ProductSubscriptionBO;
import com.appdirect.subscription.business.model.SubscriptionBO;
import com.appdirect.subscription.dao.entity.CustomerAccount;
import com.appdirect.subscription.dao.entity.CustomerAddress;
import com.appdirect.subscription.dao.entity.CustomerCompany;
import com.appdirect.subscription.dao.entity.CustomerItem;
import com.appdirect.subscription.dao.entity.CustomerOrder;

@Component
public class ProductSubscriptionTranslator {


	@Autowired
	CustomerCompanyTranslator customerCompanyTranslator;
	@Autowired
	CustomerOrderTranslator customerOrderTranslator;
	@Autowired
	CustomerAccountTranslator customerAccountTranslator;
	@Autowired
	CustomerAddressTranslator customerAddressTranslator;
	@Autowired
	CustomerItemTranslator customerItemTranslator;

	public ProductSubscriptionBO translate(SubscriptionBO subscriptionBO) {

		ProductSubscriptionBO productSubscriptionBO = new ProductSubscriptionBO();
		CustomerCompany customerCompany = customerCompanyTranslator.translate(subscriptionBO.getCompanyBO());
		CustomerOrder customerOrder = customerOrderTranslator.translate(subscriptionBO.getOrderBO());
		CustomerAccount customerAccount = customerAccountTranslator.translate(subscriptionBO.getAccountBO());
		CustomerItem customerItem = customerItemTranslator.translate(subscriptionBO.getItemBO());
		CustomerAddress customerAddress = customerAddressTranslator.translate(subscriptionBO.getAddressBO());
		
		productSubscriptionBO.setRequestType(subscriptionBO.getRequestType());
		productSubscriptionBO.setCustomerCompany(customerCompany);
		productSubscriptionBO.setCustomerOrder(customerOrder);
		productSubscriptionBO.setCustomerAccount(customerAccount);
		productSubscriptionBO.setCustomerItem(customerItem);
		productSubscriptionBO.setCustomerAddress(customerAddress);
		return productSubscriptionBO;
	}

	public SubscriptionBO translate(ProductSubscriptionBO productSubscriptionBO) {
		SubscriptionBO subscriptionBO = new SubscriptionBO();
		
		AccountBO accountBO = customerAccountTranslator.translate(productSubscriptionBO.getCustomerAccount());
		subscriptionBO.setAccountBO(accountBO);
		
		return subscriptionBO;
	}
	
}
