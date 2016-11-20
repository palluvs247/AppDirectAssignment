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

import com.appdirect.subscription.dao.entity.CustomerAccount;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class CustomerAccountRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerAccountRepository repository;

    @Test
    public void saveCustomerAccount() {
    	String accountIdentifier = "385beb51-51ae-4ffe-8c05-3f35a9f99825";
    	String email = "test123@gmail.com";
    	
    	CustomerAccount customerAccount = new CustomerAccount();
		customerAccount.setAccountIdentifier(accountIdentifier);
		customerAccount.setEmail(email);
    	
        this.entityManager.persist(customerAccount);
        CustomerAccount customerAccountEntity = this.repository.findByEmail(email);
        
        assertThat(customerAccountEntity.getAccountIdentifier(),equalTo(accountIdentifier));
    }
}