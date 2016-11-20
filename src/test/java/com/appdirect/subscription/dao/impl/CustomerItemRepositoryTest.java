package com.appdirect.subscription.dao.impl;

import java.io.Serializable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.appdirect.subscription.dao.entity.CustomerAddress;
import com.appdirect.subscription.dao.entity.CustomerItem;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class CustomerItemRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired	
    private CustomerItemRepository repository;

    @Test
    public void saveCustomerItem() {
    	String quantity = "One";
    	String unit = "gb";
    	String city = "Pune";
    	
    	CustomerItem customerItem = new CustomerItem();
    	customerItem.setQuantity(quantity);
    	customerItem.setUnit(unit);
    	
        this.entityManager.persist(customerItem);
        
    }
}