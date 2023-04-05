package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.TeacherDao;
import com.jsp.schoolManagement.dto.Teacher;

public class TeacherController {
	
	public static void main(String[] args) {
        //to add teacher or save student		
		Teacher t1 = new Teacher();
		t1.setId(5);
		t1.setName("teacher4");
		t1.setEmail("teacher4@gmail.com");
		
		TeacherDao teacherDao = new TeacherDao();
		Teacher teacher = teacherDao.saveTeacher(t1);
		if(teacher!=null) {
			System.out.println("teacher is added");
		}
		

		
	}

}
