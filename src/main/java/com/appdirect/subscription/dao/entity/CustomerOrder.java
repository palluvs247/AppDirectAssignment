package com.appdirect.subscription.dao.entity;

import java.io.Serializable;

import javax.persistence.*;



/**
 * The persistent class for the customer_order database table.
 * 
 */
@Entity
@Table(name="customer_order")
public class CustomerOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="edition_code")
	private String editionCode;

	@Column(name="item_id")
	private int itemId;

	@Column(name="pricing_duration")
	private String pricingDuration;

	//bi-directional one-to-one association to CustomerItem
	@OneToOne(fetch = FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinColumn(name="id" , nullable=false)
	private CustomerItem customerItem;

	//bi-directional one-to-one association to ProductSubscription
	@OneToOne(mappedBy="customerOrder")
	private ProductSubscription productSubscription;

	public CustomerOrder() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEditionCode() {
		return this.editionCode;
	}

	public void setEditionCode(String editionCode) {
		this.editionCode = editionCode;
	}

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getPricingDuration() {
		return this.pricingDuration;
	}

	public void setPricingDuration(String pricingDuration) {
		this.pricingDuration = pricingDuration;
	}

	public CustomerItem getCustomerItem() {
		return this.customerItem;
	}

	public void setCustomerItem(CustomerItem customerItem) {
		this.customerItem = customerItem;
	}

	public ProductSubscription getProductSubscription() {
		return this.productSubscription;
	}

	public void setProductSubscription(ProductSubscription productSubscription) {
		this.productSubscription = productSubscription;
	}

}