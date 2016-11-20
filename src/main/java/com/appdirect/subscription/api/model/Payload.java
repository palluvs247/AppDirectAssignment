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
"company",
"order",
"account"
})
public class Payload {

@JsonProperty("company")
private Company company;
@JsonProperty("order")
private Order order;
@JsonProperty("account")
private Account account;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The company
*/
@JsonProperty("company")
public Company getCompany() {
return company;
}

/**
* 
* @param company
* The company
*/
@JsonProperty("company")
public void setCompany(Company company) {
this.company = company;
}

/**
* 
* @return
* The order
*/
@JsonProperty("order")
public Order getOrder() {
return order;
}

/**
* 
* @param order
* The order
*/
@JsonProperty("order")
public void setOrder(Order order) {
this.order = order;
}

/**
* 
* @return
* The account
*/
@JsonProperty("account")
public Account getAccount() {
return account;
}

/**
* 
* @param account
* The account
*/
@JsonProperty("account")
public void setAccount(Account account) {
this.account = account;
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