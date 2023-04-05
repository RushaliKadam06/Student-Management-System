package com.jsp.schoolManagement.controller;

import com.jsp.schoolManagement.dao.StudentDao;

public class StudentControllerDel {
	
	public static void main(String[] args) {
		
		StudentDao studentDao = new StudentDao();
		boolean flag = studentDao.deleteStudentById(1);
		if(flag==true) {
			System.out.println("student is deleted");
		}else {
			System.out.println("not deleted");
		}
	}

}
