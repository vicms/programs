package netcracker.restService;



//import junit.framework.TestCase;

import netcracker.App;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestingWeb {

@Autowired
private App algo;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(algo).isNotNull();
		//assertTrue(true);
	}

}