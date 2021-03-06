package com.tara.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tara.dao.ProfessorDAO;
import com.tara.entity.Professor;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorDAO professordao;
	
	
	
	public Collection<Professor> findAll()
	{
		return professordao.findAll();
	}
	
	public Professor findByninerId(int ninerId)
	{
		return professordao.findByninerId(ninerId);
	}
	
	public void createProfessor(Professor professor)
	{
		professordao.save(professor);
	}
	
	
	/*
	 * public Student(int id, String firstName,String lastName , String emailId, String password, int ninerId) {
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
