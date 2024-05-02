package com.example.demo;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.studentregistration.controller.StudentController;
import com.studentregistration.pojo.StudentVo;

@SpringBootApplication
public class StudentregistrationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Scanner sc=new Scanner(System.in);
		String sid=sc.next();
		String name=sc.next();
		String age=sc.next();
		String regno=sc.next();
		
		StudentVo s1=new StudentVo();
		s1.setSid(sid);
		s1.setName(name);
		s1.setAge(age);
		s1.setRegno(regno);
		
		StudentController controller =(StudentController) ctx.getBean("controller");
		
		try {
			int i=controller.processRequest(s1);
			if(i>0) System.out.print("Student Saved Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.print("Something went wrong");
			e.printStackTrace();
		}
		
	}

}
