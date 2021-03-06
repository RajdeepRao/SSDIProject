package com.tara.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tara.dao.PositionDAO;
import com.tara.entity.Position;

@Service
public class PositionService {
	
	@Autowired
	private PositionDAO positiondao;
	
	
	
	public Collection<Position> findAll()
	{
		return positiondao.findAll();
	}
	
	public Position findById(int Id)
	{
		return positiondao.findById(Id);
	}
	
	public void createPosition(Position position)
	{
		positiondao.save(position);
	}

	public void deletePositionByID(int id) {
		this.positiondao.deleteByid(id);
		
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
