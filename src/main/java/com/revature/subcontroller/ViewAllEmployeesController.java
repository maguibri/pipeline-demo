package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;

import com.revature.service.Users1Service;

public class ViewAllEmployeesController {
	public static String viewAllEmployees(HttpServletRequest request) {
		
		return Users1Service.getAllEmployees();
	}
}
