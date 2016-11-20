package com.appdirect.subscription.dao.impl;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdirect.subscription.dao.entity.CustomerAccount;

@Repository
public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Serializable>{

	CustomerAccount findByAccountIdentifier(String accountIdentifier);
	CustomerAccount findByEmail(String email);

}
