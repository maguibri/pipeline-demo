package com.revature.dao;

import java.util.List;


import com.revature.model.Bursement;

public interface BursementDao {
	
	public String newBursement(int users1id, String bursementTitle, String bursementDescription,String bursementBalance);
	
	public String viewPendingRequests(int users1id);
	
	
	
	public String viewResolvedRequests(int users1id);
	
	
	
	
	public String updateBursement (int bursementId, String bursementtype);
	
	public String getAllPendingBursements();
	
	public String getAllResolvedBursements();
	
	public String getAllBursementFromEmployee(int users1id);
	
}
