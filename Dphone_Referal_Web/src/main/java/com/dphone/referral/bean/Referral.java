package com.dphone.referral.bean;


public class Referral {
	
	private String emailId;
	private String name;
	private int mobileNo;
	private int age;
	private String refferalCode;

	public Referral() {
		super();
	}

	public Referral(String emailId, String name, int mobileNo, String refferalCode) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.refferalCode = refferalCode;
	}

	public Referral(String emailId, String name, int mobileNo, int age, String refferalCode) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
		this.refferalCode = refferalCode;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getRefferalCode() {
		return refferalCode;
	}

	public void setRefferalCode(String refferalCode) {
		this.refferalCode = refferalCode;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Referral [emailId=" + emailId + ", name=" + name + ", mobileNo=" + mobileNo + ", age=" + age
				+ ", refferalCode=" + refferalCode + "]";
	}

}
