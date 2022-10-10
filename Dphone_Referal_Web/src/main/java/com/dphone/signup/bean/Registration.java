package com.dphone.signup.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Registration {
	@Id
	private String email;
	private String name;
	private long phoneNo;
	private String password;

	public Registration() {
		System.out.println("Try registering with the right credentials !");
	}

	public Registration(String name, String email, long phoneNo) {
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public Registration(String email, String name, long phoneNo, String password) {
		this.email = email;
		this.name = name;
		this.phoneNo = phoneNo;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Registration [email=" + email + ", name=" + name + ", phoneNo=" + phoneNo + ", password=" + password
				+ "]";
	}
	
}
