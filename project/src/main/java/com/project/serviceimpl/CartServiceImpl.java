package com.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.entity.Cart;
import com.project.repository.CartRepository;
import com.project.service.CartService;

public class CartServiceImpl implements CartService {
	@Autowired
	CartRepository cartRepository;

	@Override
	public List<Cart> getItems() {
		
		return cartRepository.findAll();
	}

}
