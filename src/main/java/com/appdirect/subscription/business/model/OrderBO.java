package com.appdirect.subscription.business.model;


public class OrderBO {

	private String editionCode;
	private String pricingDuration;
	private ItemBO item;

	public String getEditionCode() {
		return editionCode;
	}

	public void setEditionCode(String editionCode) {
		this.editionCode = editionCode;
	}

	public String getPricingDuration() {
		return pricingDuration;
	}

	public void setPricingDuration(String pricingDuration) {
		this.pricingDuration = pricingDuration;
	}

	public ItemBO getItem() {
		return item;
	}

	public void setItem(ItemBO item) {
		this.item = item;
	}

}
