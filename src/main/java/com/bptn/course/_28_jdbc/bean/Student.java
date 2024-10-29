package com.bptn.course._28_jdbc.bean;

public class Student {
	
	int studentId;
	int courseId;
	String studentName;
	String studentEmail;
	String studentPhone;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseId=" + courseId + ", studentName=" + studentName
				+ ", studentEmail=" + studentEmail + ", studentPhone=" + studentPhone + "]";
	}
	
	
	
	
	
	
	
	

}
