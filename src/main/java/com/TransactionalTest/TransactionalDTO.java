package com.TransactionalTest;

public class TransactionalDTO {

	private String name;
	private int age;
	private String fatherName;
	private String motherName;
	private String mobileNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public TransactionalDTO(String name, int age, String fatherName, String motherName, String mobileNo) {
		super();
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.mobileNo = mobileNo;
	}

	public TransactionalDTO() {
		// TODO Auto-generated constructor stub
	}

}
