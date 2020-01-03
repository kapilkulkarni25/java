package com.deloitte.library.services;

import java.sql.SQLException;
import java.util.List;

import com.deloitte.library.dao.BooksDAO;
import com.deloitte.library.model.Book;

public class booksimpl implements bookInt{

	@Override
	public Book addBook(String author, double price,String book_Name) throws SQLException {
		// TODO Auto-generated method stub
		Book addbook =new Book();
		addbook.setAuthor_Name(author);
		addbook.setPrice(price);
		addbook.setBook_name(book_Name);
		Book.setBook_Id(BooksDAO.getCounter());
		BooksDAO.addBook(addbook);
		
		return addbook;
	
	}

	@Override
	public List<Book> Display() throws SQLException {
		
		return BooksDAO.Display();
		// TODO Auto-generated method stub
		
	
	}


	
}
