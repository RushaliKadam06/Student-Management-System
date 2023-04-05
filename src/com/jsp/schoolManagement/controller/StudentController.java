package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.StudentDao;
import com.jsp.schoolManagement.dto.Student;

public class StudentController {
	
	public static void main(String[] args) {
		
		 //class to add student
	     Student s1 = new Student();
	     s1.setId(6);
	     s1.setName("Rushali");
	     s1.setEmail("abc@gmail.com");
	     
	     StudentDao std = new StudentDao();
	    Student student = std.saveStudent(s1);
	    if(student!=null) {
	    	System.out.println("student "+student.getName()+" is added succesfully");
	    	
	    }
	    
	    
	}

}
