package com.appdirect.subscription.dao.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appdirect.subscription.dao.entity.CustomerAccount;
import com.appdirect.subscription.dao.entity.CustomerCompany;
import com.appdirect.subscription.dao.entity.CustomerOrder;
import com.appdirect.subscription.dao.entity.ProductSubscription;
import com.appdirect.subscription.dao.impl.CustomerAccountRepository;
import com.appdirect.subscription.dao.impl.CustomerAddressRepositoryTest;
import com.appdirect.subscription.dao.impl.CustomerCompanyRepositoryTest;
import com.appdirect.subscription.dao.impl.CustomerItemRepositoryTest;
import com.appdirect.subscription.dao.impl.CustomerOrderRepository;
import com.appdirect.subscription.dao.impl.ProductSubscriptionRepository;

@Component
public class SubscriptionDaoFacade {

	@Autowired
	CustomerCompanyRepositoryTest customerCompanyRepository;
	@Autowired
	CustomerOrderRepository customerOrderRepository;
	@Autowired
	CustomerAccountRepository customerAccountRepository;
	@Autowired
	CustomerAddressRepositoryTest customerAddressRepository;
	@Autowired
	CustomerItemRepositoryTest customerItemRepository;
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


	public CustomerCompanyRepositoryTest getCustomerCompanyRepository() {
		return customerCompanyRepository;
	}

	public CustomerOrderRepository getCustomerOrderRepository() {
		return customerOrderRepository;
	}

	public CustomerAccountRepository getCustomerAccountRepository() {
		return customerAccountRepository;
	}

	public CustomerAddressRepositoryTest getCustomerAddressRepository() {
		return customerAddressRepository;
	}

	public CustomerItemRepositoryTest getCustomerItemRepository() {
		return customerItemRepository;
	}

	public ProductSubscriptionRepository getProductSubscriptionRepository() {
		return productSubscriptionRepository;
	}
	
}
