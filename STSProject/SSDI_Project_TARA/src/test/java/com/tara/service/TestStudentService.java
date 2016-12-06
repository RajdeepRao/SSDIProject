package com.tara.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tara.SsdiProjectTaraApplication;
import com.tara.entity.Student;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SsdiProjectTaraApplication.class)
public class TestStudentService {
	
	@Autowired
    private StudentService studentService;
 
    //Add WebApplicationContext field here.
 
    //The setUp() method is omitted.
	@Test
	public void testValidGetStudentById() throws Exception {
		boolean condition = false;
		Student s = studentService.findByninerId(13);
		if (s.getninerId() == 13)
			condition = true;
		assertTrue(condition);
	}
	
	@Test
	public void testInValidGetStudentById() throws Exception {
		boolean condition = false;
		
		if (studentService.findByninerId(78)== null)
			condition = true;
		assertTrue(condition);
	}
	
	@Test
	public void testValidAddStudent() throws Exception{
		boolean condition = false;
		Student student = new Student();
		student.setFirstName("test1");
		student.setLastName("test1");
		student.setEmailId("test1@test1.com");
		student.setPassword("test1");
		student.ninerId(21);
		studentService.createStudent(student);
		Student response = studentService.findByninerId(21);
		if (response.getninerId()==21)
			condition = true;
		assertTrue(condition);
	}
	
	@Test
	public void testInvalidAddStudent() throws Exception{
		boolean condition = false;
		Student student = new Student();
		try {
			studentService.createStudent(student);
		} catch (Exception e) {
			condition = true;
		}
		assertTrue(condition);
	}
	

	
}