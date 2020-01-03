package com.deloitte.library.model;

public class Book {
private static int book_Id;
private static String author_Name;
private  static double price;
private static int count=100;
private static String book_name;

public Book() {
	count++;
}

public int getBook_Id() {
	return book_Id;
}

public static void setBook_Id(int book_Id) {
	Book.book_Id = book_Id;
}

public static int getCount() {
	return count;
}

public static void setCount(int count) {
	Book.count = count;
}

public String getAuthor_Name() {
	return author_Name;
}
public void setAuthor_Name(String author) {
	Book.author_Name = author;
}
public String getBook_name() {
	return book_name;
}

public void setBook_name(String book_name) {
	Book.book_name = book_name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price2) {
	Book.price = price2;
}

@Override
public String toString() {
	return "Book [book_Id=" + book_Id + ", author_Name=" + author_Name + ", price=" + price + ", book_name=" + book_name
			+ "]";
}


}
