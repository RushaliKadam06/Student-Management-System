package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.TeacherDao;

public class TeacherControllerGetById {
	
	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.getTeacherById(3);
	}

}
