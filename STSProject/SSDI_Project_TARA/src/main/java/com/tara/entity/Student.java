package com.tara.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Student {
	
	@NotNull(message = "Missing first name")
	private String firstName;
	@NotNull(message = "Missing last name")
	private String lastName;
	@NotNull(message = "Missing email")
	private String emailId;
	@NotNull(message = "Missing password")
	private String password;
	@Id
	@NotNull
	private int ninerId;
	
	public Student(String firstName,String lastName , String emailId, String password, int ninerId) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.password=password;
		this.ninerId=ninerId;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int getninerId() {
		return ninerId;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void ninerId(int ninerId) {
		this.ninerId = ninerId;
	}
}
