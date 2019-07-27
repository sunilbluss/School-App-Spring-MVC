package com.my_school.model;

import java.util.List;

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private String address;
	private String contactNumber;
	private List<Course> courses;
	
	public Student() {
		super();
	}

	public Student(int studentId, String firstName, String lastName, String address, String contactNumber,
			List<Course> courses) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactNumber = contactNumber;
		this.courses = courses;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
