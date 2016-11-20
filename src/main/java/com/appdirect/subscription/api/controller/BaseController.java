package com.appdirect.subscription.api.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.appdirect.subscription.api.helper.ResponseHelper;
import com.appdirect.subscription.api.validator.RequestValidator;

public class BaseController {

	
	@Autowired
	RequestValidator requestValidator;
	
	
	@Autowired
	ResponseHelper responseHelper;
}
