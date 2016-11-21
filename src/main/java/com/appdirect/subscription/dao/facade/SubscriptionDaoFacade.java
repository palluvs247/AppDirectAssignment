package com.appdirect.subscription.dao.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appdirect.subscription.dao.entity.CustomerAccount;
import com.appdirect.subscription.dao.entity.CustomerCompany;
import com.appdirect.subscription.dao.entity.CustomerOrder;
import com.appdirect.subscription.dao.entity.ProductSubscription;
import com.appdirect.subscription.dao.impl.CustomerAccountRepository;
import com.appdirect.subscription.dao.impl.CustomerAddressRepository;
import com.appdirect.subscription.dao.impl.CustomerCompanyRepository;
import com.appdirect.subscription.dao.impl.CustomerItemRepository;
import com.appdirect.subscription.dao.impl.CustomerOrderRepository;
import com.appdirect.subscription.dao.impl.ProductSubscriptionRepository;

@Component
public class SubscriptionDaoFacade {

	@Autowired
	CustomerCompanyRepository customerCompanyRepository;
	@Autowired
	CustomerOrderRepository customerOrderRepository;
	@Autowired
	CustomerAccountRepository customerAccountRepository;
	@Autowired
	CustomerAddressRepository customerAddressRepository;
	@Autowired
	CustomerItemRepository customerItemRepository;
	@Autowired
	ProductSubscriptionRepository productSubscriptionRepository;


	public void saveProductSubscription(CustomerCompany customerCompany,
			CustomerOrder customerOrder, CustomerAccount customerAccount) {
		ProductSubscription productSubscription = new ProductSubscription();
		productSubscription.setAccountId(customerAccount.getId());
		productSubscription.setCompanyId(customerCompany.getId());
		productSubscription.setStatus(customerAccount.getStatus());
		productSubscription.setOrderId(customerOrder.getId());
		productSubscriptionRepository.save(productSubscription);
	}


	public CustomerCompanyRepository getCustomerCompanyRepository() {
		return customerCompanyRepository;
	}

	public CustomerOrderRepository getCustomerOrderRepository() {
		return customerOrderRepository;
	}

	public CustomerAccountRepository getCustomerAccountRepository() {
		return customerAccountRepository;
	}

	public CustomerAddressRepository getCustomerAddressRepository() {
		return customerAddressRepository;
	}

	public CustomerItemRepository getCustomerItemRepository() {
		return customerItemRepository;
	}

	public ProductSubscriptionRepository getProductSubscriptionRepository() {
		return productSubscriptionRepository;
	}
	
}
