package com.niit.dao;

import com.niit.model.UserInfo;


	public interface UserDao 
	{
		public boolean registerUser(UserInfo userinfo);
		public boolean updateAddress(UserInfo userinfo);
		public UserInfo getUser(String username);


	
	
}
