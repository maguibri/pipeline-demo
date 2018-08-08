package com.revature.dao;

import com.revature.model.Users1;

public interface Users1Dao {
	
	public Users1 login(String username, String password);
	
	public String viewAccount (int users1id);
	
	public String updatePassword (int users1id, String newPassword);
	
	public String getAllEmployees ();

}
