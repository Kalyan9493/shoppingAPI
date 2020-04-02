package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Product;
import com.project.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	ProductService productService;
	Product product;

	@PostMapping("/")
	public Product saveProducts(@RequestBody Product product) {

		return productService.saveProduct(product);
	}

	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long pid) {

		return productService.getProduct(pid);
	}

	@GetMapping("/")
	public List<Product> productlist(@RequestParam(required = false,defaultValue = "") String os,@RequestParam(required = false,defaultValue = "") String catagory) {
		
		return productService.listOfProducts(os.trim(),catagory.trim());

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long pid) {
		productService.deleteProduct(pid);
	}
	
	@PutMapping("/")
	public Product update(@RequestBody Product product) {
		
		return productService.update(product);
		
	}
}