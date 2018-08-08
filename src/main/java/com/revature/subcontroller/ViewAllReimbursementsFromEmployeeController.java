package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.revature.service.BursementService;

public class ViewAllReimbursementsFromEmployeeController {
	public static String viewAllReimbursementsFromEmployee(HttpServletRequest request) {
		HttpSession session = request.getSession();

		System.out.println(request.getParameter("inputUserid"));
		System.out.println(session.getAttribute("users1_Id"));
		
		
		return BursementService.getBursementService().getAllBursementFromEmployee(Integer.parseInt(request.getParameter("inputUserid")));
	}

}
