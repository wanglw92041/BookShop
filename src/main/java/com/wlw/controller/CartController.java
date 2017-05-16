package com.wlw.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wlw.model.Book;
import com.wlw.model.ShoppingCart;
import com.wlw.service.impl.BookService;
import com.wlw.service.impl.ShoppingCartService;

@Controller
public class CartController {
	@Autowired
	private BookService bookService;
	@Autowired
	private ShoppingCartService shoppingCartService;

	@RequestMapping("/getMyCart")
	public String getMyCart(HttpSession session, Model model) {
		String memberName = (String) session.getAttribute("username");
		List<ShoppingCart> cartList = shoppingCartService.getMyCart(memberName);
		List<Book> list = new ArrayList<Book>();
		for (ShoppingCart cart : cartList) {
			Book book = bookService.getBookById(cart.getBookID());
			book.setTypeID(cart.getCount());
			book.setInformation(cart.getShoppingCartID());
			list.add(book);
		}
		model.addAttribute("list", list);
		return "shoppingCart.jsp";
	}
}
