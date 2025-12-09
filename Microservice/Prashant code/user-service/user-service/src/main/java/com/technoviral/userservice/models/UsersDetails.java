package com.technoviral.userservice.models;


public class UsersDetails {
	
	public String userBio;
	
	public String phone;

	public UsersDetails() {
	}

	public UsersDetails(String userBio, String phone) {
		this.userBio = userBio;
		this.phone = phone;
	}

	public String getUserBio() {
		return userBio;
	}

	public void setUserBio(String userBio) {
		this.userBio = userBio;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
