package com.atdev.serviceimpl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atdev.entity.Student;
import com.atdev.service.StudentService;

@RestController
@RequestMapping("api/v1/student")
public class StudentCntroller {

	@Autowired
	StudentService studentService;

	@GetMapping
	public ResponseEntity<List<Student>> getAllStudents() {

		return new ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.OK);

	}

	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(studentService.addStudent(student), HttpStatus.OK);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable int id, @RequestBody Student student) {

		return new ResponseEntity<String>(studentService.updateStudent(id, student), HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id) {

		return new ResponseEntity<String>(studentService.removeStudent(id), HttpStatus.OK);

	}

}
