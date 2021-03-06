package com.tara.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tara.entity.Professor;
import com.tara.service.ProfessorService;

@RestController
@RequestMapping("/professors")

public class ProfessorController {
	
	@Autowired
	private ProfessorService professorservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Professor> findAll(){
		 return professorservice.findAll();
	 }
	
	@RequestMapping(value="/{ninerId}", method = RequestMethod.GET)
	public Professor findById(@PathVariable("ninerId") int ninerId){
		 return professorservice.findByninerId(ninerId);
	 }
	
	@RequestMapping(method = RequestMethod.PUT)
	public void createStudent(@RequestBody Professor professor){
		professorservice.createProfessor(professor);
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
