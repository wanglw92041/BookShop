package com.wlw.service;

import java.util.List;

import com.wlw.model.ShoppingCart;

public interface IShoppingCartService {
	public List<ShoppingCart> getMyCart(String memberName);
}
