package netcracker.restService;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import netcracker.DTO.Agreement;
import netcracker.DTO.SubProduct;
import netcracker.restService.ApiConsume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.fasterxml.jackson.databind.ObjectMapper;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



/**
 * Unit test for simple mockmvc Netcracker API.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class  ApiConsumeTest 
    
{
    /**
     * Create the test for mockmvc i mean:  lo mockeo ;)
     *
     * Main class for Api consume test services for Netcracker API
     *
     * TDD from here deploying the needed classes
     * in the packages required
     * 
     */
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@Autowired
	 RestTemplate restTemplate;
	
	/**
	 * Testing just the connection and param use
	 * Mocking the environment
	 * @throws Exception
	 */
    @Test
    public void testApiConsume() throws Exception 
    {

    	
    		
   	String pokename =  "ditto";
    	
    
  	mockMvc.perform(get("/api/v1/info/"+pokename))
   	.andDo(print())
   	.andExpect(status().isOk());
		
    }
    
    /**
     * Testing Point to point flow 
     * TDD minimal values for creating file and receive obj
     * 
     * @throws Exception
     */
    
    @Test
    public void testDataStructure() throws Exception 
    {

    	
    ObjectMapper objectMapper = new ObjectMapper();
   		
   	ApiConsume pk = new ApiConsume();
   	Agreement in = new Agreement();
	List<SubProduct> lista = new ArrayList<SubProduct>();
	SubProduct sub = new SubProduct();
	sub.setName("sub1");
	sub.setPrice(2.2);
	lista.add(sub);
	SubProduct sub2 = new SubProduct();
	sub2.setName("sub2");
	sub2.setPrice(4.33);
	lista.add(sub2);
	in.setProducts(lista);
	in.setSignedBy("VMS");
   	Agreement cr = pk.attr(in);
   	
   	
   	objectMapper.writeValueAsString(cr);
   	
   	assertTrue(cr.getProducts()!=null && cr.getSignedBy()!=null);
   	
  
    }
    
    
    /**
     * Testing Point - Testing the file creation / recovery  
     * TDD minimal values for Recovering  file and parse again
     * 
     * @throws Exception
     */
    
    @Test
    public void testDataFile() throws Exception 
    {

    	
    ObjectMapper objectMapper = new ObjectMapper();
   	ApiConsume pk = new ApiConsume();
   	
	
   	Agreement cr = pk.rett("Agreement30-04-2020");
   	
   	objectMapper.writeValueAsString(cr);
   	
   	assertTrue(cr.getName()!=null );
   	
  
    }
    
    
}
