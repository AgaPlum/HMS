package com.tcs.bean;

public class User {
	private int userId;
	private String name;
	private String userName;
	private String password;
	private String email;
	private String contactNumber;
	private int admin;
	
	public User(int id, String name, String username, String password,
			String email, int isAdmin,String contactNumber) {
		super();
		this.userId = id;
		this.name = name;
		this.userName = username.toLowerCase();
		this.password = password;
		this.email = email.toLowerCase();
		this.admin = isAdmin;
		this.contactNumber=contactNumber;
	}
	public User() {
		super();
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getId() {
		return userId;
	}
	public void setId(int id) {
		this.userId = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		this.userName = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIsAdmin() {
		return admin;
	}
	public void setIsAdmin(int isAdmin) {
		this.admin = isAdmin;
	}
	
}
