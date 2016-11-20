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
"city",
"country",
"firstName",
"fullName",
"lastName",
"state",
"street1",
"zip"
})
public class Address {

@JsonProperty("city")
private String city;
@JsonProperty("country")
private String country;
@JsonProperty("firstName")
private String firstName;
@JsonProperty("fullName")
private String fullName;
@JsonProperty("lastName")
private String lastName;
@JsonProperty("state")
private String state;
@JsonProperty("street1")
private String street1;
@JsonProperty("zip")
private String zip;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The city
*/
@JsonProperty("city")
public String getCity() {
return city;
}

/**
* 
* @param city
* The city
*/
@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

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
* The fullName
*/
@JsonProperty("fullName")
public String getFullName() {
return fullName;
}

/**
* 
* @param fullName
* The fullName
*/
@JsonProperty("fullName")
public void setFullName(String fullName) {
this.fullName = fullName;
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
* The state
*/
@JsonProperty("state")
public String getState() {
return state;
}

/**
* 
* @param state
* The state
*/
@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

/**
* 
* @return
* The street1
*/
@JsonProperty("street1")
public String getStreet1() {
return street1;
}

/**
* 
* @param street1
* The street1
*/
@JsonProperty("street1")
public void setStreet1(String street1) {
this.street1 = street1;
}

/**
* 
* @return
* The zip
*/
@JsonProperty("zip")
public String getZip() {
return zip;
}

/**
* 
* @param zip
* The zip
*/
@JsonProperty("zip")
public void setZip(String zip) {
this.zip = zip;
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
