package com.appdirect.subscription.dao.entity;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the product_subscription database table.
 * 
 */
@Entity
@Table(name="product_subscription")
public class ProductSubscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="account_id")
	private int accountId;

	@Column(name="company_id")
	private int companyId;

	@Column(name="order_id")
	private int orderId;

	private String status;

	//bi-directional one-to-one association to CustomerAccount
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id")
	private CustomerAccount customerAccount;

	//bi-directional one-to-one association to CustomerCompany
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id")
	private CustomerCompany customerCompany;

	//bi-directional one-to-one association to CustomerOrder
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id")
	private CustomerOrder customerOrder;

	public ProductSubscription() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountId() {
		return this.accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CustomerAccount getCustomerAccount() {
		return this.customerAccount;
	}

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}

	public CustomerCompany getCustomerCompany() {
		return this.customerCompany;
	}

	public void setCustomerCompany(CustomerCompany customerCompany) {
		this.customerCompany = customerCompany;
	}

	public CustomerOrder getCustomerOrder() {
		return this.customerOrder;
	}

	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}

}