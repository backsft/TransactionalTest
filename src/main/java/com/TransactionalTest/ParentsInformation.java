package com.TransactionalTest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class ParentsInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long parentsId;
	private String fatherName;
	private String motherName;
	private String mobileNo;

	public long getParentsId() {
		return parentsId;
	}

	public void setParentsId(long parentsId) {
		this.parentsId = parentsId;
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

	public ParentsInformation(String fatherName, String motherName, String mobileNo) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.mobileNo = mobileNo;
	}

	public ParentsInformation() {
		// TODO Auto-generated constructor stub
	}

}