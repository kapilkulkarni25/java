package com.deloitte.ITCinema.services;

import java.util.List;

import com.deloitte.ITCinema.model.MovieAdmin;

public interface AdminInt {
	public  void adddetails(String name,String email,String phone,String password);
	public boolean login(String user, String pass) ;
	public List<MovieAdmin> display();

}
