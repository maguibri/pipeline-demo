package com.revature.requesthelper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.revature.subcontroller.CreateNewBursementController;
import com.revature.subcontroller.LoginController;
import com.revature.subcontroller.UpdateBursementController;
import com.revature.subcontroller.UpdatePasswordController;
import com.revature.subcontroller.ViewAllEmployeesController;
import com.revature.subcontroller.ViewPendingRequestsController;
import com.revature.subcontroller.ViewAllPendingBursementsControlelr;
import com.revature.subcontroller.ViewAllReimbursementsFromEmployeeController;
import com.revature.subcontroller.ViewResolvedRequestsController;
import com.revature.subcontroller.ViewAllResolvedBursementsControlelr;
import com.revature.subcontroller.ViewAccountController;



public class RequestHelper {

	public static String process(HttpServletRequest request) {
		
		System.out.println(request.getRequestURI());
		
		switch(request.getRequestURI()) {
		
		
//*****************************Employee Functions************************************		
		case "/Project1/html/login.do":
			
			System.out.println("switchlogin");
			
			return LoginController.login(request);
			
		case "/Project1/viewPendingRequests.do":
			System.out.println("viewpending");
			
			return ViewPendingRequestsController.viewPendingRequests(request);
			
		case "/Project1/viewResolvedRequests.do":
			System.out.println("viewresolved");
			
			return ViewResolvedRequestsController.viewResolvedRequests(request);
			
			
		case "/Project1/viewAccount.do" :
			System.out.println("viewuser");
			//return "javccob";
			//System.out.println("viewuser");
			
			return ViewAccountController.viewAccount(request);
			

			
			
		case "/Project1/updatePassword.do" :
			System.out.println("updatePassword");
			
		
			return UpdatePasswordController.updatePassword(request);
			
			
		case "/Project1/html/createNewBursement.do":
			System.out.println("createBursement");

			return CreateNewBursementController.createNewBursement(request);
		
		case "/Project1/html/updateBursement.do":
			System.out.println("updateBursement");
			
			return UpdateBursementController.update(request);
			
//*****************************Manager Functionality**********************************************
			
		case "/Project1/viewAllPendingBursements.do":
			System.out.println("viewAllPendingBursements");
			
			return ViewAllPendingBursementsControlelr.viewAllPendingBursements(request);
			 
		case "/Project1/viewAllResolvedBursements.do":
			System.out.println("viewAllResolvedBursements");
			
			return ViewAllResolvedBursementsControlelr.viewAllResolbedBursements(request);
			
		case "/Project1/viewAllEmployees.do":
			System.out.println("viewAllEmployees");
			
			return ViewAllEmployeesController.viewAllEmployees(request);
			
		case "/Project1/viewEmployeeReimbursements.do":
			System.out.println("viewAllReimbursementsFromEmployee");
			
			return ViewAllReimbursementsFromEmployeeController.viewAllReimbursementsFromEmployee(request);
			
		case "/Project1/changeBursement.do":
			System.out.println("changebursement");
			
			return UpdateBursementController.update(request);
		
		case "/Project1/html/logout.do":
			
			HttpSession session = request.getSession();
			session.invalidate();
			
			return "login.html";
			
			
		default:
			return "default switch";
		}
	}
}
