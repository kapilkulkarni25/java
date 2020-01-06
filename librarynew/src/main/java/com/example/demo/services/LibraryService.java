package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LibraryDAO;
import com.example.demo.model.Book;

@Service
public class LibraryService {
	
	
	@Autowired
	LibraryDAO dao;
	public ArrayList<Book> Display(int userid) {
		return dao.Display(userid);
		
	}
	public void add(Book b) {
		// TODO Auto-generated method stub
	
		dao.add(b);
	}
	

}
