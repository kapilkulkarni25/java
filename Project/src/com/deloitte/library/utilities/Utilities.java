package com.deloitte.library.utilities;

import com.deloitte.library.exceptions.BookNameException;

public class Utilities {
	public static void nameValidation(String BookName) throws BookNameException
	{
		String pattern = "^[A-Za-z]+$"; 
		if(!BookName.matches(pattern))
		{
			throw new BookNameException("Book Name can only be Alphabets");
		}
	}
	}

