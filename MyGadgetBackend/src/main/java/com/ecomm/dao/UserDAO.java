package com.ecomm.dao;

import com.ecomm.entity.User;

public interface UserDAO  
{
	
		public boolean registerUser(User user);
		public boolean updateUser(User user);
		public User getUser(String username);
	


}
