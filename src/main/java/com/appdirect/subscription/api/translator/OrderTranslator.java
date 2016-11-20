package com.appdirect.subscription.api.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.api.model.Order;
import com.appdirect.subscription.business.model.ItemBO;
import com.appdirect.subscription.business.model.OrderBO;

@Component
public class OrderTranslator {

	public OrderBO translate(Order order, ItemBO itemBO) {

		if (null == order) {
			return null;
		}
		OrderBO orderBO = new OrderBO();

		orderBO.setEditionCode(order.getEditionCode());
		orderBO.setPricingDuration(order.getPricingDuration());
		orderBO.setItem(itemBO);

		return orderBO;
	}
}
