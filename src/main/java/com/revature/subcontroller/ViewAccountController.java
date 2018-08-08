package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.revature.service.Users1Service;

public class ViewAccountController {
	
	public static String viewAccount(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		return Users1Service.getUsers1Service().viewAccount((int) session.getAttribute("users1_Id"));
	}

}
