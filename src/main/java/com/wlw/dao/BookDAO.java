package com.wlw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.wlw.model.Book;
@Repository
public interface BookDAO {
	
	@Select("select * from book")
	public List<Book> getAllBook();

	@Select("select * from book where bookName like CONCAT('%',#{key},'%') or author like CONCAT('%',#{key},'%') or typeID in (SELECT typeID from booktype where typeName like CONCAT('%',#{key},'%'))")
	public List<Book> getBookByKey(String key);

	@Select("select * from book where bookID=#{bookID}")
	public Book getBookByID(int bookID);
}
