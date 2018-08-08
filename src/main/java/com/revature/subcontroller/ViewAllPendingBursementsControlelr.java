package com.revature.subcontroller;

import javax.servlet.http.HttpServletRequest;

import com.revature.service.BursementService;

public class ViewAllPendingBursementsControlelr {
	
	public static String viewAllPendingBursements(HttpServletRequest request) {
		System.out.println("cvonoasjdfwol2ljrwqlejr;ljdf;lasd");
		return BursementService.getBursementService().getAllPendingBursement();
	}
}
