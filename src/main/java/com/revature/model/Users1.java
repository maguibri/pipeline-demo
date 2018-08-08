package com.revature.model;

public class Users1 {
	
	private int users1id;
	private String username;
	private String password;
	private String usertype;
	
	
	
	
	
	public Users1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users1(int users1id, String username, String password, String usertype) {
		super();
		this.users1id = users1id;
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + users1id;
		result = prime * result + ((usertype == null) ? 0 : usertype.hashCode());
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
		Users1 other = (Users1) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (users1id != other.users1id)
			return false;
		if (usertype == null) {
			if (other.usertype != null)
				return false;
		} else if (!usertype.equals(other.usertype))
			return false;
		return true;
	}
	public int getUsers1id() {
		return users1id;
	}
	public void setUsers1id(int users1id) {
		this.users1id = users1id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "[users1id=" + users1id + ", username=" + username + ", password=" + password + ", usertype=" + usertype + "]";
	}
}