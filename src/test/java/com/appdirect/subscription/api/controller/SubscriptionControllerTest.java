package com.appdirect.subscription.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.appdirect.subscription.api.model.Subscription;
import com.appdirect.subscription.dao.entity.CustomerAccount;
import com.appdirect.subscription.dao.impl.CustomerAccountRepository;
import com.appdirect.subscription.utils.SubscriptionMock;
import com.google.gson.Gson;

/**
 * @author Josh Long
 */

@WebAppConfiguration
public class SubscriptionControllerTest extends AbstractTest {


    private static final String SUBSCRIPTION_REST_URL = "/subscription";

	private static final String INVALID_ACCOUNT_IDENTIFIER = "INVALID_ACCOUNT_IDENTIFIER";

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;
    
    @Autowired
    CustomerAccountRepository accountCustomerRepository; 


    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void createSubscription_positive() throws Exception {
        mockMvc.perform(post(SUBSCRIPTION_REST_URL)
                .content(SubscriptionMock.getCreateSubscriptionJsonMock().getBytes())
                .contentType(contentType))
                .andExpect(status().is2xxSuccessful())
                .andExpect(status().isCreated());
    }
    
    @Test
    public void createSubscription_existing_account() throws Exception {
    	String emailId = SubscriptionMock.getCreateSubscriptionMock().getCreator().getEmail();
    	CustomerAccount customerAccount = accountCustomerRepository.findByEmail(emailId);
    	
    	Subscription  subscription = SubscriptionMock.getCreateSubscriptionMock();
    	subscription.getPayload().getAccount().setAccountIdentifier(customerAccount.getAccountIdentifier());
    	
        mockMvc.perform(post(SUBSCRIPTION_REST_URL)
                .content(getSubscriptionContent(subscription))
                .contentType(contentType))
                .andExpect(status().is4xxClientError());
    }

	private byte[] getSubscriptionContent(Subscription subscription) {
		return (new Gson().toJson(subscription)).getBytes();
	}
    
    @Test
    public void updateSubscription_positive() throws Exception {
    	String emailId = SubscriptionMock.getCreateSubscriptionMock().getCreator().getEmail();
    	CustomerAccount customerAccount = accountCustomerRepository.findByEmail(emailId);
    	
    	Subscription  subscription = SubscriptionMock.getChangeSubscriptionMock();
    	subscription.getPayload().getAccount().setAccountIdentifier(customerAccount.getAccountIdentifier());
    	
        mockMvc.perform(put(SUBSCRIPTION_REST_URL)
                .content(getSubscriptionContent(subscription))
                .contentType(contentType))
                .andExpect(status().is2xxSuccessful())
                .andExpect(status().isOk());
    }
    
    @Test
    public void updateSubscription_invalid_account() throws Exception {
    	
    	Subscription  subscription = SubscriptionMock.getChangeSubscriptionMock();
    	subscription.getPayload().getAccount().setAccountIdentifier(INVALID_ACCOUNT_IDENTIFIER);
    	
        mockMvc.perform(put(SUBSCRIPTION_REST_URL)
                .content(getSubscriptionContent(subscription))
                .contentType(contentType))
                .andExpect(status().is4xxClientError());
    }
}