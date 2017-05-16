package com.wlw.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.wlw.dao.BookDAO;
import com.wlw.model.Book;
import com.wlw.service.IBookService;

@Service
public class BookService implements IBookService {
	@Resource
	private BookDAO bookDAO;

	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Book book = bookDAO.getBookByID(id);
		return book;
	}

	public List<Book> getBook() {
		// TODO Auto-generated method stub
		List<Book> list = bookDAO.getAllBook();
		return list;
	}

	public List<Book> getBookByKey(String key) {
		// TODO Auto-generated method stub
		List<Book> list = bookDAO.getBookByKey(key);
		return list;
	}

}
