package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.TeacherDao;

public class TeacherControllerGetAll {
	
	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.getAllTeacher();
	}

}
