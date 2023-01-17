package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.bean.College;
import com.student.bean.Student;

public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);
		Student student4 = (Student) context.getBean("student4");
		System.out.println(student4);
		
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		College college1 = (College) context.getBean("college1");
		System.out.println(college1);
		College college2 = (College) context.getBean("college2");
		System.out.println(college2);
		College college3 = (College) context.getBean("college3");
		System.out.println(college3);
		College college4 = (College) context.getBean("college4");
		System.out.println(college4);
	}

}
