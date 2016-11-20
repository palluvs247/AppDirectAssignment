package com.appdirect.subscription.api.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"accountIdentifier",
"success",
"errorCode",
"message"
})
public class SubscriptionResponse {
	@JsonProperty("accountIdentifier")
	String accountIdentifier;
	@JsonProperty("success")
	boolean success;
	@JsonProperty("errorCode")
	String errorCode;
	@JsonProperty("message")
	String message;

	public SubscriptionResponse(String accountIdentifier, boolean status,
			String errorCode, String message) {
		super();
		this.accountIdentifier = accountIdentifier;
		this.success = status;
		this.errorCode = errorCode;
		this.message = message;
	}

	public String getAccountIdentifier() {
		return accountIdentifier;
	}

	public void setAccountIdentifier(String accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
