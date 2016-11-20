
package com.appdirect.subscription.translator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.appdirect.subscription.api.model.Order;
import com.appdirect.subscription.api.translator.OrderTranslator;
import com.appdirect.subscription.dao.entity.CustomerOrder;
import com.appdirect.subscription.utils.SubscriptionMock;


public class OrderTranslatorTest {

	Order orderMock = null;
	OrderTranslator orderTranslator  = null;
	
	@Before
	public void setUp() throws Exception {
		orderMock = SubscriptionMock.getCreateSubscriptionMock().getPayload().getOrder();
		orderTranslator = new OrderTranslator();
	}

/*	@Test
	public void test_translate() {
		assertEquals(CustomerOrder.class, orderTranslator.translate(orderMock).getClass());
		assertNotNull(orderTranslator.translate(orderMock));
		assertNull(orderTranslator.translate(null));
		assertEquals("Standard", orderTranslator.translate(orderMock).getEditionCode());
	}
*/
}
