package com.studentregistration.dao;

import java.sql.SQLException;

import com.studentregistration.pojo.StudentEntity;

public interface studentdao {
public int saveStudent(StudentEntity entity) throws SQLException;
public StudentEntity getStudent(int sid) throws SQLException;
}
