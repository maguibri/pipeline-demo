package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.revature.service.Users1Service;

public class UpdatePasswordController {
	
	public static String updatePassword(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		System.out.println(session.getAttribute("users1_Id"));
		System.out.println(request.getParameter("newPassword"));
		
		
		//session.setAttribute("password", request.getParameter("newPassword"));
		return Users1Service.getUsers1Service().updatePassword((int) session.getAttribute("users1_Id"), request.getParameter("newPassword"));
	}

}
