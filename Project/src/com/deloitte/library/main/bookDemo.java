package com.deloitte.library.main;
import java.sql.SQLException;
import java.util.*;

import com.deloitte.library.exceptions.BookNameException;
import com.deloitte.library.model.Book;
import com.deloitte.library.services.booksimpl;
import com.deloitte.library.utilities.Utilities;

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
		System.out.println("Enter Option 1 to Add Book\n Enter option 2 to Display Books\n Enter option 3 to Search Books\n Enter option 4 to Delete\n Enter option 5 to exit");
		System.out.println("Enter Your choice:");
		option=sc.nextInt();
		switch(option)
		{
		case 1:
			while(true)
			{
			System.out.println("Enter Book Name:");
			book_Name=sc.next();
			try {
				Utilities.nameValidation(book_Name);
				break;
			} catch (BookNameException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getmessage());
				continue;
			}
			}
			System.out.println("Enter Author Name:");
			author=sc.next();
			System.out.println("Enter Price:");
			price=Double.parseDouble(sc.next());
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
			List<Book> flag= bookimp.SearchBook(bName);
			for(Book b:books)
			{
				System.out.println(b);
			}
			break;
		case 4:
			System.out.print("Enter Book Id");
			int bookId=Integer.parseInt(sc.next());
			boolean delete = bookimp.bookdelete(bookId);
			if(delete)
			{
				System.out.println("Book Deleted Successfully");
			}
			else 
			{
				System.out.println("Book Id not Found");
			}
			break;
			
		case 5:
			System.exit(0);
			break;
			
			
	}
	}
}
}
