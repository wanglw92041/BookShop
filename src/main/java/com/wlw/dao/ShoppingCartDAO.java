package com.wlw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.wlw.model.ShoppingCart;
@Repository
public interface ShoppingCartDAO {
	@Select("select * from shoppingcart where memberName=#{memberName}")
	public List<ShoppingCart> getMyCart(String memberName);
}
