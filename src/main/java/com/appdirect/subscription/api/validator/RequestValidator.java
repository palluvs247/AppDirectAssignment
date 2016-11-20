package com.appdirect.subscription.api.validator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.api.model.Payload;
import com.appdirect.subscription.api.model.Subscription;
import com.appdirect.subscription.business.exception.UnknownErrorException;

@Component
public class RequestValidator {

	
	public void validateCreateSubscriptionRequest(Subscription subscription) {
		validateNotNull(subscription);
		Payload payload = subscription.getPayload();
		validateNotNull(payload);
		validateNotNull(payload.getCompany());
		validateNotNull(payload.getOrder());
	}


	public void validateUpdateSubscriptionRequest(Subscription subscription) {
		validateNotNull(subscription);
		Payload payload = subscription.getPayload();
		validateNotNull(payload);
		validateNotNull(payload.getOrder());
		validateNotNull(payload.getAccount());
	}
	
	private void validateNotNull(Object obj) {
		if (null == obj) {
			throw new UnknownErrorException();
		}
	}
}
