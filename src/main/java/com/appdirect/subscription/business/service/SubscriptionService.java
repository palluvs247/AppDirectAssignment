package com.appdirect.subscription.business.service;

import com.appdirect.subscription.business.model.SubscriptionBO;

public interface SubscriptionService {

	public SubscriptionBO createSubscription(SubscriptionBO subscriptionDO);

	public SubscriptionBO updateSubscription(SubscriptionBO subscription);
}
