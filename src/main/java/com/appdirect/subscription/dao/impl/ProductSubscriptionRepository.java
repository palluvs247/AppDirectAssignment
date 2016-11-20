package com.appdirect.subscription.dao.impl;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdirect.subscription.dao.entity.ProductSubscription;

@Repository
public interface ProductSubscriptionRepository extends JpaRepository<ProductSubscription, Serializable>{

	ProductSubscription findByAccountId(int accountId);
	
}