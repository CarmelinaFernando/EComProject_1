package com.niit.carmel.dao;

import java.util.List; 

import com.niit.carmel.model.Product;

public interface ProductDao {
	
	// methods for CRUD operations
	
	List <Product> getAllProducts();
	void delete(Product product);
	Product saveProduct(Product product);
	Product getProductById(int id);
	

}
