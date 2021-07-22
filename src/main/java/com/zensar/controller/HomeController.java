package com.zensar.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.beans.Product;
import com.zensar.repository.ProductRepository;
import com.zensar.service.ProductService;

@RestController
public class HomeController {
	@Autowired
	private ProductService pservice;
	
	
	@PostMapping("/products")
	public Product insertProducts(@RequestBody Product product) {
		return pservice.insertProduct(product);
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return pservice.getAllProducts();
	}
}
