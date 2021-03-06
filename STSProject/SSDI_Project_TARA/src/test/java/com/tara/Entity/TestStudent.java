package com.tara.Entity;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tara.SsdiProjectTaraApplication;
import com.tara.entity.Student;
import com.tara.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SsdiProjectTaraApplication.class)
public class TestStudent{

	private Student student;
    
	@Autowired
    private StudentService studentService;

    @Before
	public void setUp() throws Exception{
    	student = new Student();
    	student.setFirstName("test");
    	student.setLastName("test");
    	student.setEmailId("test");
    	student.setPassword("test12");
    	student.ninerId(13);
	}
    
 
    @Test
    public void testValidFirstName() throws Exception{
    	boolean exceptionCaught = false;
    	try{
    		studentService.createStudent(student );
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
    }
  
    @Test
    public void testInvalidFirstName() throws Exception{
    	
    	boolean exceptionCaught = false;
		try{
			student.setFirstName(null);
			studentService.createStudent(student);
		}
		catch(Exception e){
			exceptionCaught = true;
		}
		assertTrue(exceptionCaught);
    }
    
    @Test
    public void testValidLastName() throws Exception{
    	boolean exceptionCaught = false;
    	try{
    		studentService.createStudent(student);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
    }
  
    @Test
    public void testInvalidLastName() throws Exception{
    	
    	boolean exceptionCaught = false;
		try{
			student.setLastName(null);
			studentService.createStudent (student);
		}
		catch(Exception e){
			exceptionCaught = true;
		}
		assertTrue(exceptionCaught);
    }
    @Test
    public void testValidEmailId() throws Exception{
    	boolean exceptionCaught = false;
    	try{
    		studentService.createStudent(student);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
    }
  
    @Test
    public void testInvalidEmailId() throws Exception{
    	
    	boolean exceptionCaught = false;
		try{
			student.setEmailId(null);
			studentService.createStudent(student);
		}
		catch(Exception e){
			exceptionCaught = true;
		}
		assertTrue(exceptionCaught);
    }
    
    @Test
    public void testValidPassword() throws Exception{
    	boolean exceptionCaught = false;
    	try{
    		studentService.createStudent(student);
    	}catch(Exception e){
    		exceptionCaught = true;
    	}
    	assertFalse(exceptionCaught);
    }
  
    @Test
    public void testInvalidPassword() throws Exception{
    	
    	boolean exceptionCaught = false;
		try{
			student.setPassword(null);
			studentService.createStudent(student);
		}
		catch(Exception e){
			exceptionCaught = true;
		}
		assertTrue(exceptionCaught);
    }
}