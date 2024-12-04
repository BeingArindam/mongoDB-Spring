package com.example.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.entity.Student;
import com.example.mongodb.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
	
	@GetMapping("/all")
	public List<Student> getAll(){
		return studentService.findAll();
	}
	
	@GetMapping("/studentByName/{name}")
	public List<Student> getStudentsByName(@PathVariable String name){
		return studentService.getStudentsByName(name);
	}
	
	@GetMapping("/studentByNameAndEmail")
	public List<Student> getStudentsByNameAndEmail(@RequestParam String name, @RequestParam String email){
		return studentService.getStudentsByNameAndEmail(name, email);
	}
	
	@GetMapping("/allWithPagination")
	public List<Student> getStudentsByNameAndEmail(@RequestParam int pageNo, @RequestParam int pageSize){
		return studentService.getAllWithPagination(pageNo, pageSize);
	}
	
	@GetMapping("/allWithSort")
	public List<Student> getStudentsWithSort(){
		return studentService.getAllWithSort();
	}
	
	@GetMapping("/studentsByDepartment/{departmentName}")
	public List<Student> getStudentsByDepartment(@PathVariable String departmentName){
		return studentService.getStudentsByDepartment(departmentName);
	}
}
