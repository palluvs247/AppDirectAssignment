package com.appdirect.subscription.business.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.business.model.CompanyBO;
import com.appdirect.subscription.dao.entity.CustomerCompany;

@Component
public class CustomerCompanyTranslator {

	public CustomerCompany translate(CompanyBO companyBO) {

		if (null == companyBO) {
			return null;
		}
		CustomerCompany customerCompany = new CustomerCompany();

		customerCompany.setCountry(companyBO.getCountry());
		customerCompany.setName(companyBO.getName());
		customerCompany.setPhoneNumber(companyBO.getPhoneNumber());
		customerCompany.setUuid(companyBO.getUuid().getBytes());
		customerCompany.setWebsite(companyBO.getWebsite());

		return customerCompany;
	}

}
