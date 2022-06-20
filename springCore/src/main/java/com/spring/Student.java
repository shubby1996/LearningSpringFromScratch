package com.spring;

import org.springframework.beans.factory.annotation.Autowired;


public class Student {
	
	private Integer studentId;

	private String studentName;
	
	
	private Address studentAddress;
	
	

	public Integer getStudentId() {
		return studentId;
	}



	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public Address getStudentAddress() {
		
		return studentAddress;
	}

	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress.getHouse_number()
				+ "]";
	}

	


}
