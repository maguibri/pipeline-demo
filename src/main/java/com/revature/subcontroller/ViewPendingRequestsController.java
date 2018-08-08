package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.revature.service.BursementService;

public class ViewPendingRequestsController {
	
	public static String viewPendingRequests(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		return BursementService.getBursementService().viewPendingRequests((int) session.getAttribute("users1_Id"));
	}
}