package com.deloitte.library.services;

import java.sql.SQLException;
import java.util.List;

import com.deloitte.library.model.Book;

public interface bookInt {
	
	public Book addBook(String author,double price,String book_Name) throws SQLException;
	public List<Book> Display() throws SQLException;
	public List<Book> SearchBook(String book_Name) throws SQLException;
	public boolean bookdelete(int deleteId) throws SQLException;

}
