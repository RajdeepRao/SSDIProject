package com.tara.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tara.dao.TestTakersDAO;
import com.tara.entity.TestTakers;

@Service
public class TestTakersService {
	
	@Autowired
	private TestTakersDAO testtakersdao;
	
	
	public Collection<TestTakers> findAll()
	{
		return testtakersdao.findAll();
	}
	
	public TestTakers findById(int Id)
	{
		return testtakersdao.findById(Id);
	}
	
	public void createTest(TestTakers testtakers)
	{
		testtakersdao.save(testtakers);
	}

	public void deleteTestTakersByID(int id) {
		this.testtakersdao.deleteByid(id);
		
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
