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
"address",
"email",
"firstName",
"language",
"lastName",
"locale",
"openId",
"uuid"
})
public class Creator {

@JsonProperty("address")
private Address address;
@JsonProperty("email")
private String email;
@JsonProperty("firstName")
private String firstName;
@JsonProperty("language")
private String language;
@JsonProperty("lastName")
private String lastName;
@JsonProperty("locale")
private String locale;
@JsonProperty("openId")
private String openId;
@JsonProperty("uuid")
private String uuid;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The address
*/
@JsonProperty("address")
public Address getAddress() {
return address;
}

/**
* 
* @param address
* The address
*/
@JsonProperty("address")
public void setAddress(Address address) {
this.address = address;
}

/**
* 
* @return
* The email
*/
@JsonProperty("email")
public String getEmail() {
return email;
}

/**
* 
* @param email
* The email
*/
@JsonProperty("email")
public void setEmail(String email) {
this.email = email;
}

/**
* 
* @return
* The firstName
*/
@JsonProperty("firstName")
public String getFirstName() {
return firstName;
}

/**
* 
* @param firstName
* The firstName
*/
@JsonProperty("firstName")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

/**
* 
* @return
* The language
*/
@JsonProperty("language")
public String getLanguage() {
return language;
}

/**
* 
* @param language
* The language
*/
@JsonProperty("language")
public void setLanguage(String language) {
this.language = language;
}

/**
* 
* @return
* The lastName
*/
@JsonProperty("lastName")
public String getLastName() {
return lastName;
}

/**
* 
* @param lastName
* The lastName
*/
@JsonProperty("lastName")
public void setLastName(String lastName) {
this.lastName = lastName;
}

/**
* 
* @return
* The locale
*/
@JsonProperty("locale")
public String getLocale() {
return locale;
}

/**
* 
* @param locale
* The locale
*/
@JsonProperty("locale")
public void setLocale(String locale) {
this.locale = locale;
}

/**
* 
* @return
* The openId
*/
@JsonProperty("openId")
public String getOpenId() {
return openId;
}

/**
* 
* @param openId
* The openId
*/
@JsonProperty("openId")
public void setOpenId(String openId) {
this.openId = openId;
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
