package com.tara;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tara.dao.StudentDAO;
import com.tara.entity.Student;
import com.tara.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {
	
	@Autowired
	private StudentService studentservice;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateStudent() {
		int id = 7;
		String firstName="Rumit";
		String lastName="Gajera";
		String emailId="sgajera@gmail.com";
		String password="xyz";
		int ninerId=800902445;

	}

	@Test
	public void testUpdateStudent() {
		fail("Not yet implemented");
	}

}
