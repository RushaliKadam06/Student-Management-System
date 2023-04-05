package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.TeacherDao;

public class TeacherControllerDel {
	
	public static void main(String[] args) {
		//to delete student
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.deleteTeacherById(2);
		
	}

}
