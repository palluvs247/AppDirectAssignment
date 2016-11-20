package com.appdirect.subscription.translator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.appdirect.subscription.api.model.Company;
import com.appdirect.subscription.api.translator.CompanyTranslator;
import com.appdirect.subscription.dao.entity.CustomerCompany;
import com.appdirect.subscription.utils.SubscriptionMock;


public class CompanyTransalatorTest {

	Company companyMock = null;
	CompanyTranslator companyTranslator  = null;
	
	@Before
	public void setUp() throws Exception {
		companyMock = SubscriptionMock.getCreateSubscriptionMock().getPayload().getCompany();
		companyTranslator = new CompanyTranslator();
	}

	@Test
	public void test_translate() {
		assertEquals(CustomerCompany.class, companyTranslator.translate(companyMock).getClass());
		assertNotNull(companyTranslator.translate(companyMock));
		assertNull(companyTranslator.translate(null));
		assertEquals("PALLAV", companyTranslator.translate(companyMock).getName());
	}

}
