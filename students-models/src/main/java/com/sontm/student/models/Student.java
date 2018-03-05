package com.sontm.student.models;

public class Student {
	private String sOrdinalNumber;
	private String sFullName;
	private String sAddress;
	private String sCourseName;
	private String sIDNo;
	private String sMobileNo;

	public Student() {

	}

	public Student(String sOrdinalNumber, String sFullName, String sAddress, String sCourseName, String sIDNo,
			String sMobileNo) {
		this.sOrdinalNumber = sOrdinalNumber;
		this.sFullName = sFullName;
		this.sAddress = sAddress;
		this.sCourseName = sCourseName;
		this.sIDNo = sIDNo;
		this.sMobileNo = sMobileNo;
	}

	public String getsOrdinalNumber() {
		return sOrdinalNumber;
	}

	public void setsOrdinalNumber(String sOrdinalNumber) {
		this.sOrdinalNumber = sOrdinalNumber;
	}

	public String getsFullName() {
		return sFullName;
	}

	public void setsFullName(String sFullName) {
		this.sFullName = sFullName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getsCourseName() {
		return sCourseName;
	}

	public void setsCourseName(String sCourseName) {
		this.sCourseName = sCourseName;
	}

	public String getsIDNo() {
		return sIDNo;
	}

	public void setsIDNo(String sIDNo) {
		this.sIDNo = sIDNo;
	}

	public String getsMobileNo() {
		return sMobileNo;
	}

	public void setsMobileNo(String sMobileNo) {
		this.sMobileNo = sMobileNo;
	}

	@Override
	public String toString() {
		return "Student [sOrdinalNumber=" + sOrdinalNumber + ", sFullName=" + sFullName + ", sAddress=" + sAddress
				+ ", sCourseName=" + sCourseName + ", sIDNo=" + sIDNo + ", sMobileNo=" + sMobileNo + "]";
	}

}
