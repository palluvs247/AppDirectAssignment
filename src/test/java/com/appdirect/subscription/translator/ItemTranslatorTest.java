package com.appdirect.subscription.translator;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.appdirect.subscription.api.model.Item;
import com.appdirect.subscription.api.translator.ItemTranslator;
import com.appdirect.subscription.dao.entity.CustomerItem;
import com.appdirect.subscription.utils.SubscriptionMock;


public class ItemTranslatorTest {

	Item itemMock = null;
	ItemTranslator itemTranslator  = null;
	
	@Before
	public void setUp() throws Exception {
		itemMock = SubscriptionMock.getCreateSubscriptionMock().getPayload().getOrder().getItem();
		itemTranslator = new ItemTranslator();
	}

	@Test
	public void test_translate() {
		assertEquals(CustomerItem.class, itemTranslator.translate(itemMock).getClass());
		assertNotNull(itemTranslator.translate(itemMock));
		assertNull(itemTranslator.translate(null));
		assertEquals("USER", itemTranslator.translate(itemMock).getUnit());
	}

}
