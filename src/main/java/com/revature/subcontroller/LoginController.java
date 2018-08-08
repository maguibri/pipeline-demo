package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.revature.model.Users1;
import com.revature.service.Users1Service;

public class LoginController {
	
	public static String login (HttpServletRequest request) {
		System.out.println("helllowiyidfs");
		
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
		
		Users1 loggedUser = Users1Service.login(
				request.getParameter("username"),
				request.getParameter("password")
				);
		System.out.println(loggedUser);
		
		// Wrong Credentials
		if(loggedUser.getUsername().equals("") || loggedUser.getUsername() == null) {
			System.out.println("whatlkjalksjdf");
			return "login.html";
		}
		else {
			/* Storing loggedCustomer to current session
			SESSION SCOPE IS AVAILABLE ONLY IN THIS REQUEST (CLIENT) */
			HttpSession session = request.getSession(true);
			
			session.setAttribute("users1_Id", loggedUser.getUsers1id());
			session.setAttribute("username", loggedUser.getUsername());
			session.setAttribute("password", loggedUser.getPassword());
			session.setAttribute("users1type", loggedUser.getUsertype());
			//Forward user to hit another controller
			
			System.out.println("session");
			
			if(loggedUser.getUsertype().equals("manager")) {
				return "/html/managerHomepage.html";
			}
			else
				return "/html/employeeHomepage.html";
		}
	}
}