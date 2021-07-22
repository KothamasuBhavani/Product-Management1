package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.beans.Product;
import com.zensar.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prepo;

	public Product insertProduct(Product product) {
		return prepo.save(product);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return prepo.findAll();
	}

}
