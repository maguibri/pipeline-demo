package com.revature.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import com.revature.jdbcutil.Jbdcconnection;
import com.revature.model.Users1;


public class Users1DaoImpl {
	
	private static Users1DaoImpl users1Dao;
	
	private Users1DaoImpl () {
		
	}
	
	public static Users1DaoImpl getDao() {
		
		if(users1Dao == null) {
			users1Dao = new Users1DaoImpl();
		}
		return users1Dao;
	}

	public Users1 login (String username, String password) {
		try {
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "SELECT * FROM users1 WHERE username = ? AND password = ?";
			System.out.println(conn == null);
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			 while (rs.next()) {
				return new Users1(
						rs.getInt("users1_Id"),
						rs.getString("username"),
						rs.getString("password"),
						rs.getString("users1type")
						);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String viewAccount (int users1id) {
		try {
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "SELECT * FROM users1 WHERE users1_Id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, users1id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				return new Users1(
						rs.getInt("users1_Id"),
						rs.getString("username"),
						rs.getString("password"),
						rs.getString("users1type")
						).toString();
			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String updatePassword (int users1id, String newPassword) {
		
		try {
			
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "UPDATE users1 set password = ? WHERE users1_Id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, newPassword);
			ps.setInt(2, users1id);
			
			if (ps.executeUpdate() > 0) {
				return "you updated your Password!";
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return "you did not update your password";
	}
	
	public String getAllEmployees () {
		try {
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "SELECT * FROM users1 WHERE users1type = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, "employee"); 
			
			ResultSet rs = ps.executeQuery();
			
			List<Users1> users = new ArrayList<Users1>();
			
			
			while(rs.next()) {
				users.add(new Users1(
						rs.getInt("users1_Id"),
						rs.getString("username"),
						rs.getString("password"),
						rs.getString("users1type")));
			}
			return users.toString();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
}