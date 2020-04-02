package com.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Cart;
import com.project.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartService cartService;
	
	@GetMapping("/")
	public List<Cart> getCartList(){
		List<Cart> items=new ArrayList<Cart>();
		items=cartService.getItems();
		return items;
	}
		

}
