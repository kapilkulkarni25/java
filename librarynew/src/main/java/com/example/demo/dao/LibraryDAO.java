package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public class LibraryDAO {
	
	public static Connection connectToDB(){
		Connection connection = null;
		
		try {
			//register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//create connection
			
			connection = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe",
							"system",
							"admin");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	
	public  ArrayList<Book> Display(int userid)
	{
		ArrayList<Book> arr=new ArrayList<Book>(); 
		PreparedStatement stmt;
		try {
			stmt = connectToDB().prepareStatement("select * from Book where bookid = ?");
			stmt.setInt(1,userid);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				Book obj = new Book();
			obj.setBookId(rs.getInt(2));
			obj.setBookName(rs.getString(1));
			obj.setPrice(rs.getInt(3));
			
			arr.add(obj);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return arr;
		
	}


	public void add (Book books) {
		// TODO Auto-generated method stub
		PreparedStatement stmt;
		try {
			stmt = connectToDB().prepareStatement("insert into Book values(?,?,?)");
			stmt.setString(1,books.getBookName());
			stmt.setInt(2,books.getBookId());
			stmt.setInt(3, books.getPrice());
		 stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}
