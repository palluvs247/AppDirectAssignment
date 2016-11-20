import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.appdirect.subscription.api.factory.AccountFactory;
import com.appdirect.subscription.api.model.Subscription;
import com.appdirect.subscription.api.translator.AddressTranslator;
import com.appdirect.subscription.api.translator.CompanyTranslator;
import com.appdirect.subscription.api.translator.ItemTranslator;
import com.appdirect.subscription.api.translator.OrderTranslator;
import com.appdirect.subscription.business.service.SubscriptionServiceImpl;
import com.appdirect.subscription.dao.impl.CustomerAccountRepository;
import com.appdirect.subscription.dao.impl.CustomerAddressRepositoryTest;
import com.appdirect.subscription.dao.impl.CustomerCompanyRepositoryTest;
import com.appdirect.subscription.dao.impl.CustomerItemRepositoryTest;
import com.appdirect.subscription.dao.impl.CustomerOrderRepository;
import com.appdirect.subscription.dao.impl.ProductSubscriptionRepository;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@WebIntegrationTest
//@RunWith(PoweMockRunner.class)
//@RunWith(SpringRunner.class)
//@SpringBootTest()

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=Application.class, loader=SpringApplicationContextLoader.class)

public class SubscriptionControllerTest {

  //Required to Generate JSON content from Java objects
  public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  //Required to delete the data added for tests.
  //Directly invoke the APIs interacting with the DB
  
  /*@Autowired
	CustomerCompanyRepository customerCompanyRepository;
	@Autowired
	CustomerOrderRepository customerOrderRepository;
	@Autowired
	CustomerAccountRepository customerAccountRepository;
	@Autowired
	CustomerAddressRepository customerAddressRepository;
	@Autowired
	CustomerItemRepository customerItemRepository;
	@Autowired
	ProductSubscriptionRepository productSubscriptionRepository;
	
	*/
  
	@Mock
	CompanyTranslator companyTranslator;
	@Mock
	OrderTranslator orderTranslator;
	@Mock
	AccountFactory accountTranslator;
	@Mock
	AddressTranslator addressTranslator;
	@Mock
	ItemTranslator itemTranslator;
	@Mock
	Subscription subscription;
	
	
	@Mock
	CustomerCompanyRepositoryTest customerCompanyRepository;
	@Mock
	CustomerOrderRepository customerOrderRepository;
	@Mock
	CustomerAccountRepository customerAccountRepository;
	@Mock
	CustomerAddressRepositoryTest customerAddressRepository;
	@Mock
	CustomerItemRepositoryTest customerItemRepository;
	@Mock
	ProductSubscriptionRepository productSubscriptionRepository;
	
	public void setUp(){
		MockitoAnnotations.initMocks(this);	
	}

  //Test RestTemplate to invoke the APIs.
  //private RestTemplate restTemplate = new TestRestTemplate();
  
  
  
  @Test
  public void testCreateSubscription(){
	  setUp();
	  SubscriptionServiceImpl subscriptionServiceImpl = new SubscriptionServiceImpl();
	  //subscriptionServiceImpl.test();
	  Subscription subscription = new Subscription();
	  //subscriptionServiceImpl.createSubscription(subscription);
  }
  
  /*@Test
  public void testUpdateSubscription(){
	  
  }*/
}