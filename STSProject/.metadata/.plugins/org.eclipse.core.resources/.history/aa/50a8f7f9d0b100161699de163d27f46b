package com.tara.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tara.entity.Position;
import com.tara.service.PositionService;

@RestController
@RequestMapping("/positions")

public class PositionController {
	
	@Autowired
	private PositionService positionservice;
	
	@RequestMapping(method = RequestMethod.GET)
	public Collection<Position> findAll(){
		 return positionservice.findAll();
	 }
	
	@RequestMapping(value="/{Id}", method = RequestMethod.GET)
	public Position findById(@PathVariable("Id") int Id){
		 return positionservice.findById(Id);
	 }
	
	@RequestMapping(method = RequestMethod.PUT)
	public void createPosition(@RequestBody Position position){
		positionservice.createPosition(position);
	 }
	/*@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deletePositionByID(@PathVariable("id") int id){
		this.positionservice.deletePositionByID(id);
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
