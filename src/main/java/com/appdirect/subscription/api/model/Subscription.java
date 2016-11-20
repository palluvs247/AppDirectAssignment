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
"type",
"marketplace",
"creator",
"payload"
})
public class Subscription {

@JsonProperty("type")
private String type;
@JsonProperty("marketplace")
private Marketplace marketplace;
@JsonProperty("creator")
private Creator creator;
@JsonProperty("payload")
private Payload payload;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The type
*/
@JsonProperty("type")
public String getType() {
return type;
}

/**
* 
* @param type
* The type
*/
@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

/**
* 
* @return
* The marketplace
*/
@JsonProperty("marketplace")
public Marketplace getMarketplace() {
return marketplace;
}

/**
* 
* @param marketplace
* The marketplace
*/
@JsonProperty("marketplace")
public void setMarketplace(Marketplace marketplace) {
this.marketplace = marketplace;
}

/**
* 
* @return
* The creator
*/
@JsonProperty("creator")
public Creator getCreator() {
return creator;
}

/**
* 
* @param creator
* The creator
*/
@JsonProperty("creator")
public void setCreator(Creator creator) {
this.creator = creator;
}

/**
* 
* @return
* The payload
*/
@JsonProperty("payload")
public Payload getPayload() {
return payload;
}

/**
* 
* @param payload
* The payload
*/
@JsonProperty("payload")
public void setPayload(Payload payload) {
this.payload = payload;
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
