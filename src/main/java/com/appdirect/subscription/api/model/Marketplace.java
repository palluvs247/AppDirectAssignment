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
"baseUrl",
"partner"
})
public class Marketplace {

@JsonProperty("baseUrl")
private String baseUrl;
@JsonProperty("partner")
private String partner;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The baseUrl
*/
@JsonProperty("baseUrl")
public String getBaseUrl() {
return baseUrl;
}

/**
* 
* @param baseUrl
* The baseUrl
*/
@JsonProperty("baseUrl")
public void setBaseUrl(String baseUrl) {
this.baseUrl = baseUrl;
}

/**
* 
* @return
* The partner
*/
@JsonProperty("partner")
public String getPartner() {
return partner;
}

/**
* 
* @param partner
* The partner
*/
@JsonProperty("partner")
public void setPartner(String partner) {
this.partner = partner;
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
