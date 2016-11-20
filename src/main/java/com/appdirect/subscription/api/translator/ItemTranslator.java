package com.appdirect.subscription.api.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.api.model.Item;
import com.appdirect.subscription.business.model.ItemBO;

@Component
public class ItemTranslator {

	public ItemBO translate(Item item) {

		if (null == item) {
			return null;
		}
		ItemBO itemBO = new ItemBO();

		itemBO.setQuantity(item.getQuantity());
		itemBO.setUnit(item.getUnit());

		return itemBO;
	}

}
