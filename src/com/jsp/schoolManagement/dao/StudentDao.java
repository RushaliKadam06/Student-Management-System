package com.jsp.schoolManagement.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.schoolManagement.dto.Student;
import com.jsp.schoolManagement.util.HelperClass;



public class StudentDao {
	
	HelperClass helperClass = new HelperClass();
	
	public Student saveStudent(Student student) {
		Connection connection = helperClass.getConnection();
		String sql ="insert into student values(?,?,?)";
		
	    PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getId());
		    preparedStatement.setString(2, student.getName());
		    preparedStatement.setString(3, student.getEmail());
		    preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
	    
	}
	
	public boolean deleteStudentById(int id) {
		
		  Connection connection = helperClass.getConnection();
		  String sql = "delete from student where id=?";
		  
		  try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		  
		  return true;
	}
	
	public boolean updateStudent(int id,Student student) {
		 Connection connection=helperClass.getConnection();
		 String sql = "update student set name=? , email=? where id=?";
		 
		 try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getEmail());
			preparedStatement.setInt(3, id);
			
			preparedStatement.execute();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return true;
		
	}
	
	public void getAllStudent() {
		Connection connection = helperClass.getConnection();
		String sql ="select * from student";
		
		try {
		 PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
		}
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void getStudentById(int id) {
		Connection connection = helperClass.getConnection();
		String sql = "select * from student where id=?";
		try {
		PreparedStatement preparedStatement =	connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println("id= "+resultSet.getInt(1));
			System.out.println("name= "+resultSet.getString(2));
			System.out.println("email= "+resultSet.getString(3));
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
