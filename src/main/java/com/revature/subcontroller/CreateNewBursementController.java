package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;

import com.revature.service.BursementService;

public class CreateNewBursementController {
	
	public static String createNewBursement(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		System.out.println(session.getAttribute("users1_Id"));
		System.out.println(session.getAttribute("users1id"));
		System.out.println(request.getAttribute("name"));
		System.out.println(request.getParameter("name"));

		return BursementService.getBursementService().newBursement(
				(int) session.getAttribute("users1_Id"), 
				request.getParameter("bursementtitle"), 
				request.getParameter("bursementdescription"), 
				request.getParameter("bursementbalance")
				);
	}
}