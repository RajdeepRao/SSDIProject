package com.tara.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tara.entity.Test;

@Repository

public interface TestDAO extends JpaRepository<Test, Integer>{
	
	Test findById(int Id);

	
    @Transactional
    void deleteByid(int id);
}


/*public class StudentDAO {

	 private static Map<Integer, Student> student;
	 
	 static{
		 student = new HashMap<Integer, Student>(){
			 {
				 put(1,new Student(1,"Rajdeep","Computer Science"));
				 put(2,new Student(2,"Vinay","Metallurgical Sciences"));
				 put(3,new Student(3,"Anish","Chemical Engineering"));
				 put(4,new Student(4,"Charanjit","Electronics"));
				 put(5,new Student(5,"Ashton","Computer Science"));
			 }
		 };
	 }
	 
	 public Collection<Student> getAllSudents(){
		 return this.student.values();
	 }

	 public Student getStudentByID(int id){
		 return this.student.get(id);
	 }
	 
	 public void deleteStudentByID(int id){
		 this.student.remove(id);
	 }
	 
	 public void updateStudent(Student newStudent){
		 Student s = student.get(newStudent.getId());
		 s.setCourse(newStudent.getCourse());
		 s.setName(newStudent.getName());
		 student.put(newStudent.getId(), newStudent);
	 }
	 
	 public void insertStudent(Student newStudent){
		 this.student.put(newStudent.getId(), newStudent);
	 }
}
*/