package com.StyleHub.service;

import com.StyleHub.exception.CartItemException;
import com.StyleHub.exception.UserException;
import com.StyleHub.model.Cart;
import com.StyleHub.model.CartItem;
import com.StyleHub.model.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);
	
	public void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;

}
