package com.StyleHub.service;

import com.StyleHub.exception.ProductException;
import com.StyleHub.model.Cart;
import com.StyleHub.model.User;
import com.StyleHub.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId, AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
