package com.example.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.mongodb.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

	List<Student> findByName(String name);
	
	List<Student> findByNameAndEmail(String name, String email);
	
	List<Student> findByDepartmentDepartmentName(String departmentName);
	
	List<Student> findByEmailIsLike(String email);
	
	@Query("{ \"name\" : \"?0\" }")
	List<Student> getByName(String name);
}
