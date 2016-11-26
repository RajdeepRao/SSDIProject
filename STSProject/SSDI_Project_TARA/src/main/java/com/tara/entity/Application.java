package com.tara.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Application {
	@Id
	@GeneratedValue
	private int id;

	@NotNull(message = "Missing ninerId")
	private Integer ninerId;
	
	@NotNull(message = "Missing email")
	private String emailId;

	@NotNull(message = "Missing first name")
	private String firstName;

	@NotNull(message = "Missing last name")
	private String lastName;
	
	private int posId;
	
	private String subject;
	
	private String instructor;

	public int getId() {
		return id;
	}
	
	public Integer getninerId() {
		return ninerId;
	}

	public void setninerId(Integer ninerId) {
		this.ninerId = ninerId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public int getposId() {
		return posId;
	}

	public void setposId(int posId) {
		this.posId = posId;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

}
