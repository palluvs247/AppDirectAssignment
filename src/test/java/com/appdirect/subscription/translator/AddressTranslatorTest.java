package com.appdirect.subscription.translator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.appdirect.subscription.api.model.Address;
import com.appdirect.subscription.api.translator.AddressTranslator;
import com.appdirect.subscription.dao.entity.CustomerAddress;
import com.appdirect.subscription.utils.SubscriptionMock;

public class AddressTranslatorTest {

	Address addressMock = null;
	AddressTranslator addressTranslator  = null;

	@Before
	public void setup() {
		addressMock = SubscriptionMock.getCreateSubscriptionMock().getCreator().getAddress();
		addressTranslator = new AddressTranslator();
	}

	@Test
	public void test_translate() {
		assertEquals(CustomerAddress.class, addressTranslator.translate(addressMock).getClass());
		assertNotNull(addressTranslator.translate(addressMock));
		assertNull(addressTranslator.translate(null));
		assertEquals("Test", addressTranslator.translate(addressMock).getFirstName());
	}

}
