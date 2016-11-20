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
"quantity",
"unit"
})
public class Item {

@JsonProperty("quantity")
private String quantity;
@JsonProperty("unit")
private String unit;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The quantity
*/
@JsonProperty("quantity")
public String getQuantity() {
return quantity;
}

/**
* 
* @param quantity
* The quantity
*/
@JsonProperty("quantity")
public void setQuantity(String quantity) {
this.quantity = quantity;
}

/**
* 
* @return
* The unit
*/
@JsonProperty("unit")
public String getUnit() {
return unit;
}

/**
* 
* @param unit
* The unit
*/
@JsonProperty("unit")
public void setUnit(String unit) {
this.unit = unit;
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
