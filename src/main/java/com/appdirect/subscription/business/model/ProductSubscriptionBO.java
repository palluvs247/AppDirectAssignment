package com.appdirect.subscription.business.model;

import com.appdirect.subscription.dao.entity.CustomerAccount;
import com.appdirect.subscription.dao.entity.CustomerAddress;
import com.appdirect.subscription.dao.entity.CustomerCompany;
import com.appdirect.subscription.dao.entity.CustomerItem;
import com.appdirect.subscription.dao.entity.CustomerOrder;

public class ProductSubscriptionBO {


	private String requestType; 
	private CustomerCompany customerCompany;
	private CustomerOrder customerOrder;
	private CustomerAccount customerAccount;
	private CustomerItem customerItem;
	private CustomerAddress customerAddress;
	
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public CustomerCompany getCustomerCompany() {
		return customerCompany;
	}
	public void setCustomerCompany(CustomerCompany customerCompany) {
		this.customerCompany = customerCompany;
	}
	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}
	public CustomerAccount getCustomerAccount() {
		return customerAccount;
	}
	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}
	public CustomerItem getCustomerItem() {
		return customerItem;
	}
	public void setCustomerItem(CustomerItem customerItem) {
		this.customerItem = customerItem;
	}
	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
}
