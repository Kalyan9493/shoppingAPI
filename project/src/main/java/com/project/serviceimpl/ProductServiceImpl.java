package com.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Product;
import com.project.repository.ProductRepository;
import com.project.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);

	}

	@Override
	public Product getProduct(Long pid) {
		return productRepository.findById(pid).orElse(new Product());
	}

	public List<Product> listOfProducts(String os, String catagory) {
		if ((os != null || catagory != null)&&(os != "" || catagory != "")) {
			return productRepository.findByCatagoryAndOs(os, catagory);
		} else {
			return productRepository.findAll();
		}
	}

	@Override
	public void deleteProduct(Long pid) {

		productRepository.deleteById(pid);
	}

	public Product update(Product product) {
		return productRepository.save(product);
	}
}