package com.wlw.service;

import java.util.List;

import com.wlw.model.Book;

public interface IBookService {
	public Book getBookById(int id);

	public List<Book> getBook();

	public List<Book> getBookByKey(String key);
}
