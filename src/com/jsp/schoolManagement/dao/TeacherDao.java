package com.jsp.schoolManagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jsp.schoolManagement.dto.Teacher;
import com.jsp.schoolManagement.util.HelperClass;

public class TeacherDao {
	
        HelperClass helperClass = new HelperClass();
		
		public Teacher saveTeacher(Teacher teacher) {
			Connection connection = helperClass.getConnection();
			String sql ="insert into teacher values(?,?,?)";
			
		    PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, teacher.getId());
			    preparedStatement.setString(2, teacher.getName());
			    preparedStatement.setString(3, teacher.getEmail());
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
			return teacher;
		    
		}
		
		public boolean deleteTeacherById(int id) {
			
			  Connection connection = helperClass.getConnection();
			  String sql = "delete from teacher where id=?";
			  
			  try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, id);
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
		
		public boolean updateTeacher(int id,Teacher teacher) {
			 Connection connection=helperClass.getConnection();
			 String sql = "update teacher set name=? , email=? where id=?";
			 
			 try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, teacher.getName());
				preparedStatement.setString(2, teacher.getEmail());
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
		
		public void getAllTeacher() {
			Connection connection = helperClass.getConnection();
			String sql ="select * from teacher";
			
			try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
			}
			 
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		public void getTeacherById(int id) {
			Connection connection = helperClass.getConnection();
			String sql = "select * from teacher where id=?";
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
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	
	


