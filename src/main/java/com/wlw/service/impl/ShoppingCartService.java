package com.wlw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wlw.dao.ShoppingCartDAO;
import com.wlw.model.ShoppingCart;
import com.wlw.service.IShoppingCartService;

@Service
public class ShoppingCartService implements IShoppingCartService {
	@Resource
	private ShoppingCartDAO shoppingCartDAO;

	public List<ShoppingCart> getMyCart(String memberName) {
		// TODO Auto-generated method stub
		List<ShoppingCart> list = shoppingCartDAO.getMyCart(memberName);
		return list;
	}

}
