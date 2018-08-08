package com.revature.service;

import java.util.List;

import com.revature.dao.BursementDaoImpl;
import com.revature.model.Bursement;

public class BursementService {
	
	private static BursementService bursementService;
	
	private BursementService() {
		
	}
	
	public static BursementService getBursementService() {
		if(bursementService == null) {
			bursementService = new BursementService();
		}
		return bursementService;
	}

	public String newBursement(int users1id, String bursementTitle, String bursementDescription, String bursementBalance) {
		return BursementDaoImpl.getDao().newBursement(users1id, bursementTitle, bursementDescription, bursementBalance);
	}
	
	public String viewPendingRequests(int users1id) {
		return BursementDaoImpl.getDao().viewPendingRequests(users1id).toString();
	}
	
	
	
	public String viewResolvedRequests(int users1id) {
		return BursementDaoImpl.getDao().viewResolvedRequests(users1id);
	}
	

	
	public String updateBursement (int bursementId, String bursementtype) {
		return BursementDaoImpl.getDao().updateBursement(bursementId, bursementtype);
	}
	
	public String getAllPendingBursement() {
		return BursementDaoImpl.getDao().getAllPendingBursements();
	}
	
	public String getAllResolvedBursement() {
		return BursementDaoImpl.getDao().getAllResolvedBursements();
	}
	
	public String getAllBursementFromEmployee(int users1id) {
		return BursementDaoImpl.getDao().getAllBursementFromEmployee(users1id);
	}
}
