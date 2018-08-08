package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.revature.service.BursementService;

public class ViewResolvedRequestsController {
	
	public static String viewResolvedRequests(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		return BursementService.getBursementService().viewResolvedRequests((int)session.getAttribute("users1_Id"));
	}

}
