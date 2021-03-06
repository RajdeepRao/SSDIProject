package com.tara.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tara.entity.Student;

@Repository

public interface StudentDAO extends JpaRepository<Student, Integer>{
	
	Student findByninerId(int ninerId);
	@Modifying
	@Query("update Student u set u.firstName= ?2,u.lastName= ?3, u.emailId= ?4, u.password= ?5 where u.ninerId = ?1")
	void setStudentInfoByninerId(int ninerId, String firstName,String lastName , String emailId, String password);
	
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