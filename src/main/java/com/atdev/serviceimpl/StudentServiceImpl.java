package com.atdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atdev.entity.Student;
import com.atdev.repository.StudentRepository;
import com.atdev.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public String removeStudent(int id) {
		if (studentRepository.existsById(id)) {

			studentRepository.deleteById(id);
			return "Deleted Successfully";
		} else {
			return "Deletion Failed";
		}
	}

	@Override
	public String updateStudent(int id, Student student) {

		if (studentRepository.existsById(id)) {

			Student student2 = studentRepository.findById(id).get();
			student2.setName(student.getName());
			student2.setClassName(student.getName());
			student2.setRollNo(student2.getRollNo());
			student2.setBatch(student.getBatch());
			student2.setDivision(student.getDivision();
			return "Updated Successfully";

		} else {
			return "Update Failed";
		}

	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
