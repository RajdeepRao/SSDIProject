package com.tara.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Score {
	@Id
	@GeneratedValue
	private int id;
	
	private int ninerId;
	
	private String studentName;
	
	private int posId;
	
	private String subject;
	
	private int score;

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

	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	public int getninerId() {
		return ninerId;
	}
	
	public void setninerId(int ninerId) {
		this.ninerId = ninerId;
	}
	
	
}
