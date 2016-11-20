package com.appdirect.subscription.translator;

import org.junit.Before;

import com.appdirect.subscription.api.factory.AccountFactory;
import com.appdirect.subscription.api.model.Account;
import com.appdirect.subscription.utils.SubscriptionMock;

public class AccountTranslatorTest {
	
	Account accountMock = null;
	AccountFactory accountTranslator  = null;

	@Before
	public void setup() {
		accountMock = SubscriptionMock.getCreateSubscriptionMock().getPayload().getAccount();
		accountTranslator = new AccountFactory();
	}

	/*@Test
	public void test_translate() {
		assertEquals(CustomerAccount.class, accountTranslator.translate(accountMock).getClass());
		assertNotNull(accountTranslator.translate(accountMock));
		assertNull(accountTranslator.translate(null));
		assertEquals("ACTIVE", accountTranslator.translate(accountMock).getStatus());
	}*/


}
