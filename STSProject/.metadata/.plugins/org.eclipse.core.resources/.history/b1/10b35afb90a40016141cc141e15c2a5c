package com.tara.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tara.entity.Student;
import com.tara.service.StudentService;

@RestController
@RequestMapping("/students")

public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> findAll(){
		 return studentservice.findAll();
	 }
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Student findById(@PathVariable("id") int id){
		 return studentservice.findById(id);
	 }
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT)
	public void createStudent(@RequestBody Student student){
		 studentservice.createStudent(student);
	 }
	
	@RequestMapping(method = RequestMethod.PUT, consumes= MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student){
		this.studentservice.updateStudent(student);
	 }
	
	/*@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteStudentByID(@PathVariable("id") int id){
		this.studentservice.deleteStudentByID(id);
	 }
	
	@RequestMapping(method = RequestMethod.PUT, consumes= MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student){
		this.studentservice.updateStudent(student);
	 }
	
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student){
		this.studentservice.insertStudent(student);
	}*/
	
}
