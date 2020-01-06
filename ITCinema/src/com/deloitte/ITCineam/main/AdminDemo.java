package com.deloitte.ITCineam.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.deloitte.ITCinema.model.MovieAdmin;
import com.deloitte.ITCinema.services.AdminImpl;

public class AdminDemo {
	public static void main(String[] args) 
	{
	AdminImpl impl=new AdminImpl();
	Scanner sc=new Scanner(System.in);
	String name;
	String email;
	String password;
	String phone;
	int option;
	while(true)
	{
	System.out.println("Enter Option 1 to Sign up\n Enter option 2 to Login \n Enter Option 3 to Display\n Enter option 4 to exit");
	option =sc.nextInt();
	switch(option)
	{
	
	case 1:
		System.out.println("Enter Name:");
		 name =sc.next();
		System.out.println("Enter Email Id:");
		email=sc.next();
		System.out.println("Enter Phone No:");
		phone=sc.next();
		System.out.println("Enter the Password:");
		password=sc.next();
		impl.adddetails(name,email,phone,password);
		System.out.println("User Added Successfully");
		break;

	case 2 :
		System.out.println("Enter User Name:");
		String user =sc.next();
		System.out.println("Enter Password:");
		String pass=sc.next();
		impl.login(user,pass);
		boolean flag =true;
		flag = impl.login(user, pass);
		if(flag)
		{
			System.out.println("Login Successful!!");
		}
		else 
			
		System.out.println("Invalid User/Password");
		break;
	case 3 :
		List<MovieAdmin> arr= new ArrayList<MovieAdmin>();
		arr = impl.display();
		for(MovieAdmin a: arr)
		{
			System.out.println(a);
		}
		break;
	
	case 4:
		System.exit(0);
		break;
						
	}

}}
	}
