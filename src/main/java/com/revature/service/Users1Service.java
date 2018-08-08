package com.revature.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.dao.Users1DaoImpl;
import com.revature.jdbcutil.Jbdcconnection;
import com.revature.model.Users1;

public class Users1Service {
	
	private static Users1Service users1Service;
	
	private Users1Service () {
		
	}
	
	public static Users1Service getUsers1Service () {
		if(users1Service == null) {
			users1Service = new Users1Service();
		}
		return users1Service;
	}
	
	public static Users1 login (String username, String password) {
		
		return Users1DaoImpl.getDao().login(username, password);
	}
		
	
	
	
	
	public static String viewAccount(int users1id) {
		
		return Users1DaoImpl.getDao().viewAccount(users1id);
	}
	
	
	
	
	
	
	public String updatePassword(int users1id, String newPassword) {
		System.out.println(newPassword);
		return Users1DaoImpl.getDao().updatePassword(users1id, newPassword);
	}
	
	public static String getAllEmployees () {
		return Users1DaoImpl.getDao().getAllEmployees();
	}
}
