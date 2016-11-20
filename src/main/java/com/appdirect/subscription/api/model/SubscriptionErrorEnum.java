package com.appdirect.subscription.api.model;

public enum SubscriptionErrorEnum {
	USER_ALREADY_EXISTS("USER_ALREADY_EXISTS" ,"The user already existing on ISV"),
	USER_NOT_FOUND("USER_NOT_FOUND"  ,"The user not found on ISV"),
	ACCOUNT_NOT_FOUND("ACCOUNT_NOT_FOUND"  ,"The account not found on ISV"), 
	UNKNOWN_ERROR("UNKNOWN_ERROR" , "Unknown Error happened");

	private final String errorCode;
	private final String description;

	private SubscriptionErrorEnum(String errorCode, String description) {
		this.errorCode = errorCode;
		this.description = description;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public String getDescription() {
		return this.description;
	}

}
