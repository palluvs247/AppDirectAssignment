package com.appdirect.subscription.business.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.appdirect.subscription.business.facade.SubscriptionFacade;
import com.appdirect.subscription.business.model.ProductSubscriptionBO;
import com.appdirect.subscription.business.model.SubscriptionBO;
import com.appdirect.subscription.business.translator.ProductSubscriptionTranslator;
import com.appdirect.subscription.business.validator.SubscriptionValidator;

@Component
public class SubscriptionServiceImpl implements SubscriptionService {

	final static Logger logger = Logger	.getLogger(SubscriptionServiceImpl.class);

	@Autowired
	SubscriptionFacade subscriptionFacade;
	
	@Autowired
	SubscriptionValidator subscriptionValidator;
	
	@Autowired
	ProductSubscriptionTranslator productSubscriptionTranslator;

	
	public SubscriptionBO createSubscription(SubscriptionBO subscriptionBO) {
		subscriptionValidator.validateCreateSubscriptionRequest(subscriptionBO);
		ProductSubscriptionBO productSubscriptionBO = productSubscriptionTranslator.translate(subscriptionBO);
		subscriptionFacade.saveSubscription(productSubscriptionBO);
		subscriptionBO  = productSubscriptionTranslator.translate(productSubscriptionBO);
		return subscriptionBO;
	}

	public SubscriptionBO updateSubscription(SubscriptionBO subscriptionBO) {
		subscriptionValidator.validateUpdateSubscriptionRequest(subscriptionBO);
		ProductSubscriptionBO productSubscriptionBO = productSubscriptionTranslator.translate(subscriptionBO);
		subscriptionFacade.updateSubscription(productSubscriptionBO);
		subscriptionBO  = productSubscriptionTranslator.translate(productSubscriptionBO);
		return subscriptionBO;
	}
}
