package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.StudentDao;
import com.jsp.schoolManagement.dto.Student;


public class StudentControllerUpdate {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Rushikesh");
		s1.setEmail("abc123@gmail.com");
		StudentDao studentDao=new StudentDao();
		boolean flag = studentDao.updateStudent(4,s1);
		if(flag==true) {
		    System.out.println("Student updated");
		}
		
		
	}

}
