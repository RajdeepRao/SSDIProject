package com.tara.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tara.dao.ApplicationDAO;
import com.tara.entity.Application;

@Service
public class ApplicationService {
	
	@Autowired
	private ApplicationDAO applicationdao;
	
	
	
	public Collection<Application> findAll()
	{
		return applicationdao.findAll();
	}
	
	public Application findById(int Id)
	{
		return applicationdao.findById(Id);
	}
	
	public void createApplication(Application application)
	{
		applicationdao.save(application);
	}

	public void deleteApplicationByID(int id) {
		this.applicationdao.deleteByid(id);
		
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
