package com.appdirect.subscription.api.translator;

import org.springframework.stereotype.Component;

import com.appdirect.subscription.api.model.Address;
import com.appdirect.subscription.business.model.AddressBO;

@Component
public class AddressTranslator {



	public AddressBO translate(Address address) {

		if (null == address) {
			return null;
		}

		AddressBO addressBO = new AddressBO();

		addressBO.setFirstName(address.getFirstName());
		addressBO.setLastName(address.getLastName());
		addressBO.setStreet1(address.getStreet1());
		addressBO.setCity(address.getCity());
		addressBO.setZip(address.getZip());
		addressBO.setState(address.getState());
		addressBO.setCountry(address.getCountry());

		return addressBO;
	}

}
