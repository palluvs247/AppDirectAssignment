
package com.appdirect.subscription.utils;

import com.appdirect.subscription.api.model.Subscription;
import com.google.gson.Gson;


public class SubscriptionMock {

	public static Subscription getCreateSubscriptionMock(){
		return getSubscription("testdata/testdata_createSubscription.json");
	}
	
	public static Subscription getChangeSubscriptionMock(){
		return getSubscription("testdata/testdata_changeSubscription.json");
	}
	
	public static String getCreateSubscriptionJsonMock(){
		return (String)JsonLoader.load("testdata/testdata_createSubscription.json");
	}
	
	
	
	public static String getChangeSubscriptionJsonMock(){
		return (String)JsonLoader.load("testdata/testdata_changeSubscription.json");
	}
	
	
	private static Subscription getSubscription(String filename){
		Object result = JsonLoader.load(filename);
		Subscription subscription = new Gson().fromJson((String) result,	Subscription.class);
		return subscription;
	}
	
	public static void main(String[] args) {
		System.out.println(getCreateSubscriptionMock());
	}
}
