package com.tara.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Test {
	@Id
	@GeneratedValue
	private int id;

	private String question;

	@NotNull(message = "Missing option")
	private String optionA;
	
	@NotNull(message = "Missing option")
	private String optionB;
	
	@NotNull(message = "Missing option")
	private String optionC;

	@NotNull(message = "Missing option")
	private String optionD;
	
	private String correctAns;
	
	private int posId;
	
	private String subject;
	
	private String instructor;
	
	private int status=0;

	public int getId() {
		return id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	
	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	
	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	
	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	
	public String getcorrectAns() {
		return correctAns;
	}

	public void setcorrectAns(String correctAns) {
		this.correctAns = correctAns;
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

	public int getStatus() {
		return status;
	}
	
}
