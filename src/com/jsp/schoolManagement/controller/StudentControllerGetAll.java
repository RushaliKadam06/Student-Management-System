package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.StudentDao;

public class StudentControllerGetAll {
	
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		studentDao.getAllStudent();
	}

}
