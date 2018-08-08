package com.revature.jdbcutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Jbdcconnection {
	
	private Jbdcconnection () {
		//creating singleton
		
	}
	
	public static void main(String[] args) {
		
		//calling my connection to database
		Connection conn = Jbdcconnection.getConnection();
		System.out.println(conn);
	}
	
	public static Connection getConnection() {
		
		InputStream in = null;
		
		try {
			
			Properties props = new Properties();
			in = new FileInputStream("C:\\Users\\Brian\\Documents\\workspace-sts-3.9.5.RELEASE\\Project1\\src\\main\\resources/connection.properties");
			
			props.load(in);
			System.out.println("Here");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Here2");
			Connection conn = null;
			
			String endpoint = props.getProperty("jdbc.url");
			
			String username = props.getProperty("jdbc.username");
			String password = props.getProperty("jdbc.password");
			
			conn = DriverManager.getConnection(endpoint, username, password);
			System.out.println("we get to connection");
			return conn;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				in.close();
			}
			catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		return null;
	}
}