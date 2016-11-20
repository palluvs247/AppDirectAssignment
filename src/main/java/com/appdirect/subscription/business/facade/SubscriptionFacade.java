package com.appdirect.subscription.business.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.appdirect.subscription.business.model.ProductSubscriptionBO;
import com.appdirect.subscription.dao.entity.CustomerAccount;
import com.appdirect.subscription.dao.entity.CustomerItem;
import com.appdirect.subscription.dao.entity.CustomerOrder;
import com.appdirect.subscription.dao.entity.ProductSubscription;
import com.appdirect.subscription.dao.facade.SubscriptionDaoFacade;


@Component
public class SubscriptionFacade {
	
	private static final String SUBSCRIPTION_CANCEL = "SUBSCRIPTION_CANCEL";
	private static final String SUBSCRIPTION_CHANGE = "SUBSCRIPTION_CHANGE";

	@Autowired
	SubscriptionDaoFacade subscriptionDaoFacade;
	
	@Transactional
	public ProductSubscriptionBO saveSubscription(ProductSubscriptionBO productSubscriptionBO) {
		saveCustomerInfo(productSubscriptionBO);
		saveOrderInfo(productSubscriptionBO.getCustomerOrder(), productSubscriptionBO.getCustomerItem());
		subscriptionDaoFacade.saveProductSubscription(productSubscriptionBO.getCustomerCompany(), productSubscriptionBO.getCustomerOrder(), productSubscriptionBO.getCustomerAccount());
		return productSubscriptionBO;
	}

	public void saveCustomerInfo(ProductSubscriptionBO productSubscriptionBO) {
		subscriptionDaoFacade.getCustomerCompanyRepository().save(productSubscriptionBO.getCustomerCompany());
		subscriptionDaoFacade.getCustomerAddressRepository().save(productSubscriptionBO.getCustomerAddress());
		subscriptionDaoFacade.getCustomerAccountRepository().save(productSubscriptionBO.getCustomerAccount());
	}
	
	public void saveOrderInfo(CustomerOrder customerOrder,	CustomerItem customerItem) {
		customerOrder.setCustomerItem(customerItem);
		customerItem.setCustomerOrder(customerOrder);
		subscriptionDaoFacade.getCustomerItemRepository().save(customerItem);
		subscriptionDaoFacade.getCustomerOrderRepository().save(customerOrder);
	}

	
	@Transactional
	public void updateSubscription(ProductSubscriptionBO productSubscriptionBO){
		CustomerAccount customerAccount = subscriptionDaoFacade.getCustomerAccountRepository().findByEmail(productSubscriptionBO.getCustomerAccount().getEmail());
		ProductSubscription productSubscription = subscriptionDaoFacade.getProductSubscriptionRepository().findByAccountId(customerAccount.getId());

		if (SUBSCRIPTION_CHANGE.equals(productSubscriptionBO.getRequestType())) {
			CustomerOrder customerOrder = productSubscriptionBO.getCustomerOrder();
			customerOrder.setId(productSubscription.getCustomerOrder().getId());

			CustomerItem customerItem = productSubscriptionBO.getCustomerItem();
			customerItem.setId(productSubscription.getCustomerOrder().getCustomerItem().getId());

			saveOrderInfo(customerOrder, customerItem);

			productSubscription.setOrderId(customerOrder.getId());
		} else if (SUBSCRIPTION_CANCEL.equals(productSubscriptionBO.getRequestType())) {
			productSubscription.setStatus("CANCELLED");
		}
		subscriptionDaoFacade.getProductSubscriptionRepository().save(productSubscription);
	}

}
