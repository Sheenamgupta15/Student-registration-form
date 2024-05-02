package com.studentregistration.service;

import java.sql.SQLException;

import com.studentregistration.pojo.StudentDto;

public interface studentservice {

	public int registerStudent(StudentDto dto) throws SQLException;
}
