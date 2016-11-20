package com.appdirect.subscription.api.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"accountIdentifier",
"status"
})
public class Account {

@JsonProperty("accountIdentifier")
private String accountIdentifier;
@JsonProperty("status")
private String status;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public Account() {
	super();
}

public Account(String accountIdentifier, String status) {
	super();
	this.accountIdentifier = accountIdentifier;
	this.status = status;
}

/**
* 
* @return
* The accountIdentifier
*/
@JsonProperty("accountIdentifier")
public String getAccountIdentifier() {
return accountIdentifier;
}

/**
* 
* @param accountIdentifier
* The accountIdentifier
*/
@JsonProperty("accountIdentifier")
public void setAccountIdentifier(String accountIdentifier) {
this.accountIdentifier = accountIdentifier;
}

/**
* 
* @return
* The status
*/
@JsonProperty("status")
public String getStatus() {
return status;
}

/**
* 
* @param status
* The status
*/
@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}