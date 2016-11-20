package com.appdirect.subscription.business.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.business.model.ItemBO;
import com.appdirect.subscription.dao.entity.CustomerItem;

@Component
public class CustomerItemTranslator {

	public CustomerItem translate(ItemBO itemBO) {

		if (null == itemBO) {
			return null;
		}
		CustomerItem customerItem = new CustomerItem();

		customerItem.setQuantity(itemBO.getQuantity());
		customerItem.setUnit(itemBO.getUnit());

		return customerItem;
	}
}
