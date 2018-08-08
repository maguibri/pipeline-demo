package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.revature.service.BursementService;

public class UpdateBursementController {
	
	public static String update (HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		System.out.println(request.getParameter("updatedStatus"));

		return BursementService.getBursementService().updateBursement (
				Integer.parseInt(request.getParameter("inputId")), 
				request.getParameter("updatedStatus"));
	}
}
