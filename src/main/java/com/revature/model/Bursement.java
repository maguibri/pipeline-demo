package com.revature.model;

public class Bursement {
	
	private int users1id;
	private int bursementid;
	private String bursementTitle;
	private String bursementDescription;
	private String bursementBalance;
	private String bursementType;
	public Bursement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bursement(int users1id, int bursementid, String bursementTitle, String bursementDescription,
			String bursementBalance, String bursementType) {
		super();
		this.users1id = users1id;
		this.bursementid = bursementid;
		this.bursementTitle = bursementTitle;
		this.bursementDescription = bursementDescription;
		this.bursementBalance = bursementBalance;
		this.bursementType = bursementType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bursementBalance == null) ? 0 : bursementBalance.hashCode());
		result = prime * result + ((bursementDescription == null) ? 0 : bursementDescription.hashCode());
		result = prime * result + ((bursementTitle == null) ? 0 : bursementTitle.hashCode());
		result = prime * result + ((bursementType == null) ? 0 : bursementType.hashCode());
		result = prime * result + bursementid;
		result = prime * result + users1id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bursement other = (Bursement) obj;
		if (bursementBalance == null) {
			if (other.bursementBalance != null)
				return false;
		} else if (!bursementBalance.equals(other.bursementBalance))
			return false;
		if (bursementDescription == null) {
			if (other.bursementDescription != null)
				return false;
		} else if (!bursementDescription.equals(other.bursementDescription))
			return false;
		if (bursementTitle == null) {
			if (other.bursementTitle != null)
				return false;
		} else if (!bursementTitle.equals(other.bursementTitle))
			return false;
		if (bursementType == null) {
			if (other.bursementType != null)
				return false;
		} else if (!bursementType.equals(other.bursementType))
			return false;
		if (bursementid != other.bursementid)
			return false;
		if (users1id != other.users1id)
			return false;
		return true;
	}
	public int getUsers1id() {
		return users1id;
	}
	public void setUsers1id(int users1id) {
		this.users1id = users1id;
	}
	public int getBursementid() {
		return bursementid;
	}
	public void setBursementid(int bursementid) {
		this.bursementid = bursementid;
	}
	public String getBursementTitle() {
		return bursementTitle;
	}
	public void setBursementTitle(String bursementTitle) {
		this.bursementTitle = bursementTitle;
	}
	public String getBursementDescription() {
		return bursementDescription;
	}
	public void setBursementDescription(String bursementDescription) {
		this.bursementDescription = bursementDescription;
	}
	public String getBursementBalance() {
		return bursementBalance;
	}
	public void setBursementBalance(String bursementBalance) {
		this.bursementBalance = bursementBalance;
	}
	public String getBursementType() {
		return bursementType;
	}
	public void setBursementType(String bursementType) {
		this.bursementType = bursementType;
	}
	@Override
	public String toString() {
		return "Bursement [users1id=" + users1id + ", bursementid=" + bursementid + ", bursementTitle=" + bursementTitle
				+ ", bursementDescription=" + bursementDescription + ", bursementBalance=" + bursementBalance
				+ ", bursementType=" + bursementType + "]" + "/n";
	}
	
	
	
	
}