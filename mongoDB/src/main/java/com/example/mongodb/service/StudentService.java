package com.example.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodb.entity.Student;
import com.example.mongodb.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> findAll(){
		return studentRepository.findAll();
	}

	public List<Student> getStudentsByName(String name) {
		return studentRepository.findByName(name);
	}

	public List<Student> getStudentsByNameAndEmail(String name, String email) {
		return studentRepository.findByNameAndEmail(name, email);
	}
	
}
