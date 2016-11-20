package com.appdirect.subscription.api.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.api.model.Company;
import com.appdirect.subscription.business.model.CompanyBO;

@Component
public class CompanyTranslator {

	public CompanyBO translate(Company company) {

		if (null == company) {
			return null;
		}
		CompanyBO companyBO = new CompanyBO();

		companyBO.setCountry(company.getCountry());
		companyBO.setName(company.getName());
		companyBO.setPhoneNumber(company.getPhoneNumber());
		companyBO.setUuid(new String(company.getUuid().getBytes()));
		companyBO.setWebsite(company.getWebsite());

		return companyBO;
	}
}
