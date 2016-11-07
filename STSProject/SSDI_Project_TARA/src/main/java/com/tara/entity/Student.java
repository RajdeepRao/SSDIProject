package com.tara.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	
	public Student(int id, String firstName,String lastName , String emailId, String password) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.password=password;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
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
	
	public void setId(int id) {
		this.id = id;
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
	
}
