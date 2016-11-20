package com.appdirect.subscription.business.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.business.model.OrderBO;
import com.appdirect.subscription.dao.entity.CustomerItem;
import com.appdirect.subscription.dao.entity.CustomerOrder;

@Component
public class CustomerOrderTranslator {

	public CustomerOrder translate(OrderBO orderBO) {

		if (null == orderBO) {
			return null;
		}
		CustomerOrder customerOrder = new CustomerOrder();
		CustomerItem customerItem = new CustomerItem();

		customerOrder.setEditionCode(orderBO.getEditionCode());
		customerOrder.setPricingDuration(orderBO.getPricingDuration());
		customerOrder.setItemId(customerItem.getId());
		customerOrder.setCustomerItem(customerItem);

		return customerOrder;
	}
}
