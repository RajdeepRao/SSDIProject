package com.tara.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tara.dao.ScoreDAO;
import com.tara.entity.Score;

@Service
public class ScoreService {
	
	@Autowired
	private ScoreDAO scoredao;
	
	
	public Collection<Score> findAll()
	{
		return scoredao.findAll();
	}
	
	public Score findById(int Id)
	{
		return scoredao.findByninerId(Id);
	}
	
	public void createScore(Score score)
	{
		scoredao.save(score);
	}

	public void deleteScoreByID(int id) {
		this.scoredao.deleteByninerId(id);
		
	}
	
	
	
	 /* public Student(int id, String firstName,String lastName , String emailId, String password, int ninerId) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.password=password;
		this.ninerId=ninerId;
	}
	 * */
	
	 /*public Collection<Student> getAllSudents(){
		 return this.studentdao.getAllSudents();
	 }
	 
	 public Student getStudentByID(int id){
		 return this.studentdao.getStudentByID(id);
	 }
	 
	 public void deleteStudentByID(int id){
		this.studentdao.deleteStudentByID(id);
	 }
	 
	 public void updateStudent(Student student){
		this.studentdao.updateStudent(student);
	 }
	 
	 public void insertStudent(Student student){
		this.studentdao.insertStudent(student);
	 }*/
}
