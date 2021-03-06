package com.tara.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class TestTakers {
	@Id
	@GeneratedValue
	private int id;
	
	private String studentName;
	
	private int posId;
	
	private String subject;
	
	private String instructor;
	
	private int taken;

	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

	public int gettaken() {
		return taken;
	}
	
	public void settaken(int taken) {
		this.taken = taken;
	}

	
	
}
