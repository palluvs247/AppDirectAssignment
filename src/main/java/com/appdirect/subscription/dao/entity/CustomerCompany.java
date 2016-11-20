package com.appdirect.subscription.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the customer_company database table.
 * 
 */
@Entity
@Table(name="customer_company")
public class CustomerCompany implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String country;

	private String name;

	@Column(name="phone_number")
	private String phoneNumber;

	private byte[] uuid;

	private String website;

	//bi-directional one-to-one association to ProductSubscription
	@OneToOne(mappedBy="customerCompany")
	private ProductSubscription productSubscription;

	public CustomerCompany() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public byte[] getUuid() {
		return this.uuid;
	}

	public void setUuid(byte[] uuid) {
		this.uuid = uuid;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public ProductSubscription getProductSubscription() {
		return this.productSubscription;
	}

	public void setProductSubscription(ProductSubscription productSubscription) {
		this.productSubscription = productSubscription;
	}

}