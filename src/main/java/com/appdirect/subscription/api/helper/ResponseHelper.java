package com.appdirect.subscription.api.helper;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.api.model.SubscriptionResponse;
import com.appdirect.subscription.business.model.SubscriptionBO;

@Component
public class ResponseHelper {

	public SubscriptionResponse getCreateSubscriptionResponse(SubscriptionBO subscriptionBO) {
		return new SubscriptionResponse(subscriptionBO.getAccountBO().getAccountIdentifier(),
				true, null, null);
	}
	
	
	public SubscriptionResponse getUpdateSubscriptionResponse(SubscriptionBO subscriptionBO) {
		return  new SubscriptionResponse(null, true, null, null);
	}

}
