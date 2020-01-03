package com.deloitte.library.main;
import java.sql.SQLException;
import java.util.*;

import com.deloitte.library.model.Book;
import com.deloitte.library.services.booksimpl;

public class bookDemo {
	public static void main(String[] args) throws SQLException
	{
		List<Book> books = new ArrayList<Book>();
		booksimpl bookimp =new booksimpl();
		
	String author;
	String book_Name;
	double price ;
	Scanner sc= new Scanner(System.in);
	int option;
	while (true)
	{
		System.out.println("Enter Option 1 to Add Book\n Enter option 2 to Display Books\n Enter option 3 to Exit");
		System.out.println("Enter Your choice:");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Enter Author Name:");
			author=sc.next();
			System.out.println("Enter Price:");
			price=Double.parseDouble(sc.next());
			System.out.println("Enter Book Name:");
			book_Name=sc.next();
		   books.add( bookimp.addBook(author, price,book_Name));
			System.out.println("Book Added Successfully");
			break;
		case 2:
			books=bookimp.Display();
			for(Book b:books)
			{
				System.out.println(b);
			}
			break;
		case 3:
			System.out.println("Enter Book Name:");
			String bName=sc.next();
			
				
	}
	}
}
}
