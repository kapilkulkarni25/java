package com.deloitte.itcinema.model;


public class User {
	private String userMobile;
	private String userEmail;
	private String movieBooked;
	private String bookingDate;
	private String seatsBooked;
	
	public String getUserMobile() {
		return userMobile;
	}
	public void setuserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getMovieBooked() {
		return movieBooked;
	}
	public void setMovieBooked(String movieBooked) {
		this.movieBooked = movieBooked;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getSeatsBooked() {
		return seatsBooked;
	}
	public void setSeatsBooked(String string) {
		this.seatsBooked = string;
	}
}
