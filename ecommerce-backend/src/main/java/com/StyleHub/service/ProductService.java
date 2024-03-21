package com.StyleHub.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.StyleHub.exception.ProductException;
import com.StyleHub.model.Product;
import com.StyleHub.request.CreateProductRequest;

public interface ProductService {
	
	public Product createproduct(CreateProductRequest req);
	
	public String deleteProduct(Long productId) throws ProductException;
	
	public Product updateProduct(Long productId, Product req) throws ProductException;
	
	public Product findProductById(Long id) throws ProductException;
	
	public List<Product> findProductByCategory(String category);
	
	public List<Product> findAllproducts();
	
	public Page<Product>getAllProduct(String category,List<String>colors,List<String>sizes, Integer minPrice, Integer maxPrice,
			Integer minDiscount,String sort,String stock,Integer pageNumber,Integer pageSize);

}
