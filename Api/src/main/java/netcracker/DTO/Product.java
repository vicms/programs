package netcracker.DTO;

import java.util.List;

import netcracker.business.BaseProduct;
import netcracker.business.Contract;


public class Product implements Contract<BaseProduct>, BaseProduct {

	Contract parent;
	List<BaseProduct> products;
	String name;
	Double price;
	public Contract getAgreement() {
		return parent;
	}
	public void setAgreement(Contract parent) {
		this.parent = parent;
	}
	public List<BaseProduct> getProducts() {
		return products;
	}
	public void setProducts(List<BaseProduct> products) {
		this.products = products;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
