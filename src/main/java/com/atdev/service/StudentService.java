package com.atdev.service;

import java.util.List;

import com.atdev.entity.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	String removeStudent(int id);
	String updateStudent(int id,Student student);
	List<Student> getAllStudents();
	 

}
