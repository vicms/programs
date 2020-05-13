package netcracker.business;

import java.util.List;

import netcracker.DTO.Product;

public interface Contract<T extends BaseProduct> {

	String getName();
	void setProducts(List<T> lista);
	List<T> getProducts();
	

}
