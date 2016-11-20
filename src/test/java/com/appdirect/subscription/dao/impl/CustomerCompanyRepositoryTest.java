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

import com.appdirect.subscription.dao.entity.CustomerCompany;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class CustomerCompanyRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired	
    private CustomerCompanyRepository repository;

    @Test
    public void saveCustomerCompany() {
    	String name = "Pallav";
    	String phoneNumber = "8600039113";
    	String country = "India";
    	
    	CustomerCompany customerCompany = new CustomerCompany();
    	customerCompany.setName(name);
		customerCompany.setPhoneNumber(phoneNumber);
		customerCompany.setCountry(country);
    	
        this.entityManager.persist(customerCompany);
        
    }
}