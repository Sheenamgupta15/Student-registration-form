package com.studentregistration.service;

import java.sql.SQLException;

import com.studentregistration.dao.studentdao;
import com.studentregistration.pojo.StudentDto;
import com.studentregistration.pojo.StudentEntity;

public class StudentServiceImpl implements studentservice {

	private studentdao dao;
	
	
	public studentdao getDao() {
		return dao;
	}


	public void setDao(studentdao dao) {
		this.dao = dao;
	}


	@Override
	public int registerStudent(StudentDto dto) throws SQLException {
		// TODO Auto-generated method stub
		StudentEntity entity=new StudentEntity();
		entity.setSid(dto.getSid());
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setRegno(dto.getRegno());
		
		int i=dao.saveStudent(entity);
		
		return i;
	}

}
