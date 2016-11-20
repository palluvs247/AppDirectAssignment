package com.appdirect.subscription.dao.impl;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdirect.subscription.dao.entity.CustomerCompany;

@Repository
public interface CustomerCompanyRepository extends JpaRepository<CustomerCompany, Serializable>{
	
}