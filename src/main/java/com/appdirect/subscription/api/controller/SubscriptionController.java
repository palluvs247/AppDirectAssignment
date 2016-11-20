package com.appdirect.subscription.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.appdirect.subscription.api.facade.SubscriptionBusinessFacade;
import com.appdirect.subscription.api.model.Subscription;
import com.appdirect.subscription.api.model.SubscriptionResponse;
import com.appdirect.subscription.api.translator.SubscriptionTranslator;
import com.appdirect.subscription.business.model.SubscriptionBO;

@Controller
@RequestMapping("/subscription")
public class SubscriptionController extends BaseController {

	@Autowired
	SubscriptionBusinessFacade subscriptionBusinessFacade;
	
	
	@Autowired
	SubscriptionTranslator subscriptionTranslator;
	

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.CREATED)
	public @ResponseBody Object createSubscription(@RequestBody Subscription subscription) {
		
		requestValidator.validateCreateSubscriptionRequest(subscription);
		SubscriptionBO subscriptionBO = subscriptionTranslator.translate(subscription);
		subscriptionBusinessFacade.createSubscription(subscriptionBO);
		SubscriptionResponse response = responseHelper.getCreateSubscriptionResponse(subscriptionBO);
		return response;
	}

		
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody Object updateSubscription(	@RequestBody Subscription subscription) {

		requestValidator.validateUpdateSubscriptionRequest(subscription);
		SubscriptionBO subscriptionBO = subscriptionTranslator.translate(subscription);
		subscriptionBusinessFacade.updateSubscription(subscriptionBO);
		SubscriptionResponse response = responseHelper.getUpdateSubscriptionResponse(subscriptionBO);
		return response;
	}
}