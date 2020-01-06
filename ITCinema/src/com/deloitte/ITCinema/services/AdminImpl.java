package com.deloitte.ITCinema.services;

import java.util.List;

import com.deloitte.ITCinema.dao.AdminDao;
import com.deloitte.ITCinema.model.MovieAdmin;

public  class AdminImpl implements AdminInt{

	@Override
	public void adddetails(String name, String email, String phone, String password) {
		
		MovieAdmin add =new MovieAdmin();
		add.setName(name);
		add.setEmail(email);
		add.setMobile(phone);
		add.setPassword(password);
		AdminDao.Signup(add);

		}

	public boolean login(String user, String pass)  {
		return AdminDao.login(user,pass);
	
	}

	@Override
	public List<MovieAdmin> display() {
		// TODO Auto-generated method stub
		
		
			return AdminDao.display();
		
	}

	
}
