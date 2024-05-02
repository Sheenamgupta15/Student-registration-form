package com.studentregistration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.studentregistration.pojo.StudentEntity;

public class StudentDaoImpl implements studentdao {

	private static final String INSERT_STUDENT="INSERT INTO student_table(sid,name,age,regno) values (?,?,?,?)";
	
	private DataSource dataSource;
	public void setDataSource(DataSource ds)
	{
		dataSource=ds;
	}
	@Override
	public int saveStudent(StudentEntity entity) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=dataSource.getConnection();
		PreparedStatement ps=con.prepareStatement(INSERT_STUDENT);
		
		ps.setInt(1, entity.getSid());
		ps.setString(2, entity.getName());
		ps.setInt(3, entity.getAge());
		ps.setInt(4, entity.getRegno());
		
		int i=ps.executeUpdate();
		
		return i;
	}

	@Override
	public StudentEntity getStudent(int sid) throws SQLException {
	
		return null;
	}

}
