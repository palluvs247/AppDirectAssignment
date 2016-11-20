package com.appdirect.subscription.dao.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import javax.persistence.Column;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.appdirect.subscription.dao.entity.CustomerAccount;
import com.appdirect.subscription.dao.entity.ProductSubscription;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class ProductSubscriptionRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ProductSubscriptionRepository repository;

    @Test
    public void saveProductSubscription() {
    	int accountId = 1;
    	int companyId = 1;
    	int orderId = 1;
    	String status = "ACTIVE";
    	
    	ProductSubscription productSubscription = new ProductSubscription();
    	
    	productSubscription.setAccountId(accountId);
    	productSubscription.setCompanyId(companyId);
    	productSubscription.setOrderId(orderId);
    	productSubscription.setStatus(status);
    	
        this.entityManager.persist(productSubscription);
        ProductSubscription productSubscriptionEntity = this.repository.findByAccountId(accountId);
        
        assertThat(productSubscriptionEntity.getAccountId(),equalTo(accountId));
    }
}
