package netcracker.restService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import netcracker.DTO.Agreement;
import netcracker.DTO.SubProduct;

import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class ApiConsume {
	
	@Autowired
	 RestTemplate restTemplate;
	
	

	@RequestMapping(value = "/api/v1/info/{name}")
	public String attri(@PathVariable(value = "name" )String name){
	
			     return name;
	    		 

	}
	
	/**
	 * 
	 * 
	 * @param String path
	 * @return Agreement object filled with the complete info about after reading the file on filesystem
	 * @throws IOException
	 */
	@RequestMapping(value = "/file", method=RequestMethod.POST)
	public Agreement rett(@RequestParam String path) throws IOException{
		
		ObjectMapper objectMapper = new ObjectMapper();

		Agreement agr = new Agreement();
		if(path!=null){
			
			
		agr = objectMapper.readValue(new FileInputStream("./data/"+path), Agreement.class);
			
		
				
		}
	
	     return agr;
	    		 

	}

	
	/**
	 * 
	 * 
	 * @param Agreement agreement
	 * @return Agreement object filled with the complete info about after creating the file on filesystem
	 * @throws IOException
	 */	
	@RequestMapping(value = "/save", method=RequestMethod.POST)
	public Agreement attr(@RequestBody Agreement agreement) throws IOException{
		
		ObjectMapper objectMapper = new ObjectMapper();

		Agreement agr = new Agreement();
		if(agreement.getProducts()!=null && agreement.getSignedBy()!=null){
			
		agr.setProducts(agreement.getProducts());
		agr.setSignedBy(agreement.getSignedBy());
		
		objectMapper.writeValue(new FileOutputStream("./data/"+agr.getName()), agr);
				
		}
	
	     return agr;
	    		 

	}
	
	
}


