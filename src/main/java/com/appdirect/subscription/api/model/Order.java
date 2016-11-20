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
"editionCode",
"pricingDuration",
"item"
})
public class Order {

@JsonProperty("editionCode")
private String editionCode;
@JsonProperty("pricingDuration")
private String pricingDuration;
@JsonProperty("item")
private Item item;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The editionCode
*/
@JsonProperty("editionCode")
public String getEditionCode() {
return editionCode;
}

/**
* 
* @param editionCode
* The editionCode
*/
@JsonProperty("editionCode")
public void setEditionCode(String editionCode) {
this.editionCode = editionCode;
}

/**
* 
* @return
* The pricingDuration
*/
@JsonProperty("pricingDuration")
public String getPricingDuration() {
return pricingDuration;
}

/**
* 
* @param pricingDuration
* The pricingDuration
*/
@JsonProperty("pricingDuration")
public void setPricingDuration(String pricingDuration) {
this.pricingDuration = pricingDuration;
}

/**
* 
* @return
* The item
*/
@JsonProperty("item")
public Item getItem() {
return item;
}

/**
* 
* @param item
* The item
*/
@JsonProperty("item")
public void setItem(Item item) {
this.item = item;
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
