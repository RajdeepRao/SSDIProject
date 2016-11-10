package com.tara.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tara.dao.StudentDAO;
import com.tara.entity.Student;


@Service
public class StudentService {
	
	@Autowired
	private StudentDAO studentdao;
	
	
	
	public Collection<Student> findAll()
	{
		return studentdao.findAll();
	}
	
	public Student findById(int id)
	{
		return studentdao.findById(id);
	}
	
	public void createStudent(Student student)
	{
		studentdao.save(student);
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
	
	public void updateStudent(Student student){
		studentdao.setStudentInfoById(student.getId(),student.getFirstName(),student.getLastName(),student.getEmailId(),student.getPassword(),student.getNinerId());
	 }

	
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
