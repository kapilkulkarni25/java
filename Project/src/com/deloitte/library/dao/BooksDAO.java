package com.deloitte.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.library.model.Book;

public class BooksDAO {
	static Connection connection=null;
	static List<Book> arr= new ArrayList<Book>();
	public static   Connection connection() throws SQLException
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin"); 
			return connection;
		} 
		 catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	
	}

public static void addBook(Book book) 
{
	try
{
	System.out.println(book);
	PreparedStatement stmt= connection().prepareStatement("insert into Book values (?,?,?,?)");
	stmt.setInt(1,book.getBook_Id());
	stmt.setString(2,book.getAuthor_Name());
	stmt.setDouble(3,book.getPrice());
	stmt.setString(4,book.getBook_name());
	int affectedRows = stmt.executeUpdate();
	System.out.println("Affected Rows"+affectedRows);
}
catch(SQLException e)
{
	e.printStackTrace();
	}
}


public static List<Book> Display() throws SQLException
{
	
	PreparedStatement stmt= connection().prepareStatement("select * from Book");
	ResultSet rs = stmt.executeQuery();
	while(rs.next())
	{
		Book book = new Book();
		
	Book.setBook_Id(rs.getInt(1));
	book.setAuthor_Name(rs.getString(2));
	book.setPrice(rs.getDouble(3));
	book.setBook_name(rs.getString(4));;
	arr.add(book);
	}
	return arr;
}

public static int getCounter() throws SQLException
{
	Connection connect=connection();
	Statement stmt;
	int count=0;
	{
		stmt=connect.createStatement();
		ResultSet rs= stmt.executeQuery("select max(BookID) from Book");
		while(rs.next())
		{
			count=rs.getInt(1);
			
		}
		count++;
		System.out.println("Count:"+count);

		return count;
	}
	
			}
}
