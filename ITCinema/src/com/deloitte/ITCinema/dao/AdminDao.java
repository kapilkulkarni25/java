package com.deloitte.ITCinema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.ITCinema.model.MovieAdmin;
public class AdminDao {
	static Connection connection=null;
	static List<MovieAdmin> arr= new ArrayList<MovieAdmin>();
	public static   Connection connection() 
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
	public static void Signup(MovieAdmin add) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement stmt = connection().prepareStatement("insert into ITCinema values (?,?,?,?)");
			stmt.setString(1,add.getName() );
			stmt.setString(2,add.getEmail());
			stmt.setString(3,add.getMobile());
			stmt.setString(4,add.getPassword());
			int affectedRows = stmt.executeUpdate();
			System.out.println("Affected Rows:"+affectedRows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static boolean login(String user, String pass)  {
		// TODO Auto-generated method stub
		Connection connect=connection();
		PreparedStatement stmt;
		try {
			stmt=connect.prepareStatement("select * from ITCinema where name = ? and password = ?");
			stmt.setString(1,user);
			stmt.setString(2,pass);
			ResultSet rs= stmt.executeQuery();
			while(rs.next())
			{
				return true;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return false;
	}
	public static List<MovieAdmin> display()  
	{
		// TODO Auto-generated method stub
		Connection connect=connection();
		PreparedStatement stmt = null;
		try {
			ResultSet rs = stmt.executeQuery();
			stmt=connect.prepareStatement("select * from ITCinema");
			while(rs.next())
			{
			MovieAdmin mov = new MovieAdmin();
			mov.setName(rs.getString(1));
			mov.setEmail(rs.getString(2));
			mov.setMobile(rs.getString(3));
			mov.setPassword(rs.getString(4));
			arr.add(mov);
		} 
		}
			catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return arr;
		
		}	
}
