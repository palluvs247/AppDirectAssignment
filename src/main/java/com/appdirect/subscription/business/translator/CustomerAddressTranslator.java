package com.appdirect.subscription.business.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.business.model.AddressBO;
import com.appdirect.subscription.dao.entity.CustomerAddress;

@Component
public class CustomerAddressTranslator {
	public CustomerAddress translate(AddressBO addressBO) {

		if (null == addressBO) {
			return null;
		}

		CustomerAddress customerAddress = new CustomerAddress();

		customerAddress.setFirstName(addressBO.getFirstName());
		customerAddress.setLastName(addressBO.getLastName());
		customerAddress.setStreet(addressBO.getStreet1());
		customerAddress.setCity(addressBO.getCity());
		customerAddress.setZip(addressBO.getZip());
		customerAddress.setState(addressBO.getState());
		customerAddress.setCountry(addressBO.getCountry());

		return customerAddress;
	}
}
