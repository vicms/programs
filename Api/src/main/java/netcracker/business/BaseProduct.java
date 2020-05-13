package netcracker.business;

import java.util.List;

public interface BaseProduct {
	
	String getName();
	void setName(String name);
	void setProducts(List<BaseProduct> lista);
	List<BaseProduct> getProducts();
	public Double getPrice();
	public void setPrice(Double price);

}
