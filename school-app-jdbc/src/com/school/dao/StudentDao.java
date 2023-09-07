package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {

	HelperClass helperClass=new HelperClass();
	Connection connection=null;
//	to delete a student
	public boolean deleteStudentById(int id) {
		connection= helperClass.getConnection();
		int i=0;
		String sql="DELETE FROM student WHERE Id=?";
//		create statement
		
			
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setInt(1, id);
				
				i=preparedStatement.executeUpdate();
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
			if(i>0) {
				return true;
			}
			else {
				return false;
			}
		
		}
		
//	to save student data
	public Student saveStudent(Student student) {
		connection=helperClass.getConnection();
		String sql="INSERT INTO student VALUES(?,?,?)";
		
//		Create statement
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
//			passes the values to delimiter/placeholder
			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());
			
//			execute
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
	      	connection.close();
	      	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
    return student;
		
	}
	

	
}
