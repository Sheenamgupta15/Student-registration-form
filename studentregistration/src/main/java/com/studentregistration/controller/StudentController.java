package com.studentregistration.controller;

import java.sql.SQLException;

import com.studentregistration.pojo.StudentDto;
import com.studentregistration.pojo.StudentVo;
import com.studentregistration.service.studentservice;

public class StudentController {
private studentservice studentService;

public studentservice getStudentService() {
	return studentService;
}

public void setStudentService(studentservice studentService) {
	this.studentService = studentService;
}

public int processRequest(StudentVo vo) throws SQLException
{
	StudentDto dto=new StudentDto();
	dto.setSid(Integer.parseInt(vo.getSid()));
	dto.setName(vo.getName());
	dto.setAge(Integer.parseInt(vo.getAge()));
	dto.setRegno(Integer.parseInt(vo.getRegno()));
	
	return studentService.registerStudent(dto);
	
}
}
