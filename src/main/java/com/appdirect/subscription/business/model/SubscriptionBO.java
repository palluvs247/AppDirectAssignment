package com.appdirect.subscription.business.model;


public class SubscriptionBO {

	private String requestType; 
	private CompanyBO companyBO;
	private OrderBO orderBO;
	private AccountBO accountBO;
	private ItemBO itemBO;
	private AddressBO addressBO;
	
	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}


	public CompanyBO getCompanyBO() {
		return companyBO;
	}

	public void setCompanyBO(CompanyBO companyBO) {
		this.companyBO = companyBO;
	}

	public OrderBO getOrderBO() {
		return orderBO;
	}

	public void setOrderBO(OrderBO orderBO) {
		this.orderBO = orderBO;
	}

	public AccountBO getAccountBO() {
		return accountBO;
	}

	public void setAccountBO(AccountBO accountBO) {
		this.accountBO = accountBO;
	}

	public ItemBO getItemBO() {
		return itemBO;
	}

	public void setItemBO(ItemBO itemBO) {
		this.itemBO = itemBO;
	}

	public AddressBO getAddressBO() {
		return addressBO;
	}

	public void setAddressBO(AddressBO addressBO) {
		this.addressBO = addressBO;
	}
	
	

}
