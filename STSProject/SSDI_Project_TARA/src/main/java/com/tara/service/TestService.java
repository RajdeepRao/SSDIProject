package com.tara.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tara.dao.TestDAO;
import com.tara.entity.Test;

@Service
public class TestService {
	
	@Autowired
	private TestDAO testdao;
	
	
	public Collection<Test> findAll()
	{
		return testdao.findAll();
	}
	
	public Test findById(int Id)
	{
		return testdao.findById(Id);
	}
	
	public void createTest(Test test)
	{
		testdao.save(test);
	}

	public void deleteTestByID(int id) {
		this.testdao.deleteByid(id);
		
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
