package com.revature.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.jdbcutil.Jbdcconnection;
import com.revature.model.Bursement;

public class BursementDaoImpl {
	
	public static BursementDaoImpl bursementDao;
	
	private BursementDaoImpl () {
		
	}
	
	public static BursementDaoImpl getDao() {
		if(bursementDao == null) {
			bursementDao = new BursementDaoImpl();
		}
		return bursementDao;
	}
	
	public String newBursement(int users1id, String bursementTitle, String bursementDescription, String bursementBalance) {
		try {
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "{call add_bursement (?,?,?,?)}";
			
			CallableStatement cs = conn.prepareCall(sql);
 			
			cs.setInt(1, users1id);
			cs.setString(2, bursementTitle);
			cs.setString(3, bursementDescription);
			cs.setString(4, bursementBalance);
			
			if(cs.executeUpdate() > 0) {
				return "you successfully added a new reimbursement";
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return "did not add bursement";
	}
	
	public String viewPendingRequests(int users1id) {
		try {
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "SELECT * FROM bursement WHERE users1_ID = ? AND bursementtype = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, users1id);
			ps.setString(2 , "pending");
						
			ResultSet rs = ps.executeQuery();
			
			List<Bursement> bursements = new ArrayList<Bursement>();
			
			while(rs.next()) {
				bursements.add(new Bursement(
						rs.getInt("users1_ID"),
						rs.getInt("bursement_ID"),
						rs.getString("bursementtitle"),
						rs.getString("bursementdescription"),
						rs.getString("bursementbalance"),
						rs.getString("bursementtype")));
			}
			return bursements.toString();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String viewResolvedRequests(int users1id) {
		try {
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "SELECT * FROM bursement WHERE users1_ID = ? AND bursementtype = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, users1id);
			ps.setString(2 , "resolved");
						
			ResultSet rs = ps.executeQuery();
			
			List<Bursement> bursements = new ArrayList<Bursement>();
			
			while(rs.next()) {
				bursements.add(new Bursement(
						rs.getInt("users1_ID"),
						rs.getInt("bursement_ID"),
						rs.getString("bursementtitle"),
						rs.getString("bursementdescription"),
						rs.getString("bursementbalance"),
						rs.getString("bursementtype")));
			}
			return bursements.toString();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String updateBursement (int bursementId, String bursementtype) {
		try {
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "UPDATE bursement set bursementtype = ? WHERE bursement_Id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, bursementtype);
			ps.setInt(2, bursementId);


			
			if( ps.executeUpdate() > 0) {
				return "updated bursement!";
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return "did not update bursement";
	}
	
	public String getAllPendingBursements() {
		try {
			Connection conn = Jbdcconnection.getConnection();
		
			String sql = "SELECT * FROM bursement WHERE bursementtype = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, "pending");
			
			ResultSet rs = ps.executeQuery();
			
			List<Bursement> bursements = new ArrayList<Bursement>();
			
			while(rs.next()) {
				bursements.add(new Bursement(
						rs.getInt("users1_Id"),
						rs.getInt("bursement_Id"),
						rs.getString("bursementtitle"),
						rs.getString("bursementdescription"),
						rs.getString("bursementbalance"),
						rs.getString("bursementtype")));
			}
			return bursements.toString();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String getAllResolvedBursements() {
		try {
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "SELECT * FROM bursement WHERE bursementtype = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, "resolved");
			ResultSet rs = ps.executeQuery();
			
			List<Bursement> bursements = new ArrayList<Bursement>();
			
			
			while(rs.next()) {
				bursements.add(new Bursement(
						rs.getInt("users1_Id"),
						rs.getInt("bursement_Id"),
						rs.getString("bursementtitle"),
						rs.getString("bursementdescription"),
						rs.getString("bursementbalance"),
						rs.getString("bursementtype")));
			}
			return bursements.toString();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String getAllBursementFromEmployee(int users1id) {
		try {
			Connection conn = Jbdcconnection.getConnection();
			
			String sql = "SELECT * FROM bursement WHERE users1_Id = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, users1id);
			
			ResultSet rs = ps.executeQuery();
			
			List<Bursement> bursements = new ArrayList<Bursement>();
			
			while(rs.next()) {
				bursements.add(new Bursement(
						rs.getInt("users1_id"),
						rs.getInt("bursement_Id"),
						rs.getString("bursementtitle"),
						rs.getString("bursementdescription"),
						rs.getString("bursementbalance"),
						rs.getString("bursementtype")));
			}
			return bursements.toString();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return "";
	}
}