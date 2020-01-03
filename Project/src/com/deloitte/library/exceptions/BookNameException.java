package com.deloitte.library.exceptions;

public class BookNameException extends Exception {
	public String detailmessage;
	public BookNameException(String message) {
		// TODO Auto-generated constructor stub
		detailmessage=message;
		
	}
	public String getmessage()
	{
		return detailmessage;
	}
	
	
	
	

}
