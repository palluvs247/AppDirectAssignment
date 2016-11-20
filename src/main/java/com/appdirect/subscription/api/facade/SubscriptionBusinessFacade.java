package com.appdirect.subscription.api.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appdirect.subscription.business.model.SubscriptionBO;
import com.appdirect.subscription.business.service.SubscriptionService;

@Component
public class SubscriptionBusinessFacade {

	@Autowired
	SubscriptionService subscriptionService;
	
	public SubscriptionBO createSubscription(SubscriptionBO subscriptionBO){
		return subscriptionService.createSubscription(subscriptionBO);
	}

	public SubscriptionBO updateSubscription(SubscriptionBO subscriptionBO){
		return subscriptionService.updateSubscription(subscriptionBO);
	}
}
