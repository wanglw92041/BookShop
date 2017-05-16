package com.wlw.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wlw.model.Book;
import com.wlw.service.impl.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;

	@RequestMapping("/getAllBook")
	public String getAllBook(HttpServletRequest request, Model model, HttpSession session) {
		if ("0".equals(request.getParameter("id"))) {
			session.invalidate();
		}
		/* BookDAO bookDAO = (BookDAO) MyBeansFactory.getBeans("bookDAO"); */
		List<Book> list = bookService.getBook();
		for (Book book : list) {
			if (book.getBookName().length() > 10) {
				book.setBookName(book.getBookName().substring(0, 11) + "...");
			}
		}
		model.addAttribute("list", list);
		return "index.jsp";
	}

	@RequestMapping("/searchBook")
	public String searchBook(HttpServletRequest request, Model model) {
		String key = request.getParameter("key");
		List<Book> list = bookService.getBookByKey(key);
		for (Book book : list) {
			if (book.getBookName().length() > 10) {
				book.setBookName(book.getBookName().substring(0, 11) + "...");
			}
		}
		model.addAttribute("list", list);
		return "index.jsp";
	}

	@RequestMapping("/getDetails")
	public String getDetails(HttpServletRequest request, Model model) {
		int bookID = Integer.parseInt(request.getParameter("bookID"));
		Book book = bookService.getBookById(bookID);
		model.addAttribute("book", book);
		return "details.jsp";
	}

}
