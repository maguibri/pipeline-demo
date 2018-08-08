package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;

import com.revature.service.BursementService;

public class ViewAllResolvedBursementsControlelr {
	
	public static String viewAllResolbedBursements(HttpServletRequest request) {
		
		return BursementService.getBursementService().getAllResolvedBursement();
	}

}
