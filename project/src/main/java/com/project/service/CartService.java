package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.entity.Cart;

@Service
public interface CartService {

	public List<Cart> getItems();

}
