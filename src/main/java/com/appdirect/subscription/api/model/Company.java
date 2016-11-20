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
"country",
"name",
"phoneNumber",
"uuid",
"website"
})
public class Company {

@JsonProperty("country")
private String country;
@JsonProperty("name")
private String name;
@JsonProperty("phoneNumber")
private String phoneNumber;
@JsonProperty("uuid")
private String uuid;
@JsonProperty("website")
private String website;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The country
*/
@JsonProperty("country")
public String getCountry() {
return country;
}

/**
* 
* @param country
* The country
*/
@JsonProperty("country")
public void setCountry(String country) {
this.country = country;
}

/**
* 
* @return
* The name
*/
@JsonProperty("name")
public String getName() {
return name;
}

/**
* 
* @param name
* The name
*/
@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

/**
* 
* @return
* The phoneNumber
*/
@JsonProperty("phoneNumber")
public String getPhoneNumber() {
return phoneNumber;
}

/**
* 
* @param phoneNumber
* The phoneNumber
*/
@JsonProperty("phoneNumber")
public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

/**
* 
* @return
* The uuid
*/
@JsonProperty("uuid")
public String getUuid() {
return uuid;
}

/**
* 
* @param uuid
* The uuid
*/
@JsonProperty("uuid")
public void setUuid(String uuid) {
this.uuid = uuid;
}

/**
* 
* @return
* The website
*/
@JsonProperty("website")
public String getWebsite() {
return website;
}

/**
* 
* @param website
* The website
*/
@JsonProperty("website")
public void setWebsite(String website) {
this.website = website;
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
