package com.appdirect.subscription.dao.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.appdirect.subscription.dao.entity.CustomerAddress;
import com.appdirect.subscription.dao.entity.CustomerCompany;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class CustomerAddressRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired	
    private CustomerAddressRepository repository;

    @Test
    public void saveCustomerAddress() {
    	String firstName = "Pallav";
    	String lastName = "Kumar";
    	String city = "Pune";
    	
    	CustomerAddress customerAddress = new CustomerAddress();
    	customerAddress.setFirstName(firstName);
    	customerAddress.setLastName(lastName);
    	customerAddress.setCity(city);
    	
        this.entityManager.persist(customerAddress);
        
    }
}