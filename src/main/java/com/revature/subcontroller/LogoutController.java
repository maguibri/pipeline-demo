package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LogoutController {
	public static String login (HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "login.html";
	}

}
