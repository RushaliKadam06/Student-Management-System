package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.StudentDao;

public class StudentControllerGetById {
	
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		studentDao.getStudentById(3);
		studentDao.getStudentById(4);
	}

}
