package netcracker.DTO;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import netcracker.business.Contract;
import netcracker.DTO.Product;

public class Agreement implements Contract<SubProduct> {
	
	
	
	private  String name  = "Agreement";
	String signedBy;
	List<SubProduct> products;

	
	public Agreement(){
		Calendar fecha = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		name+=sdf.format(fecha.getTime());
		 
	}
	
	public String getName() {
		return name;
	}

	public String getSignedBy() {
		return signedBy;
	}
	public void setSignedBy(String signedBy) {
		this.signedBy = signedBy;
	}
	public List<SubProduct> getProducts() {
		return products;
	}
	public void setProducts(List<SubProduct> products) {
		this.products = products;
	}
	
	
	

}
