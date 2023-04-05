package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.TeacherDao;
import com.jsp.schoolManagement.dto.Teacher;

public class TeacherControllerUpdate {
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setName("teacher4");
		t1.setEmail("teacher4@gmail.com");
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.updateTeacher(3, t1);
	}

}
