package netcracker.DTO;

import java.util.List;

import netcracker.business.BaseProduct;

public class SubProduct implements BaseProduct{

	List<BaseProduct> products;
	String name;
	Double price;
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
