package com.RESTAPIapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.RESTAPIapp.entity.Student;
import com.RESTAPIapp.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stdserv;
	
	@PostMapping("/student")
	public Student save (@RequestBody Student std) {
		return stdserv.saveStudent(std);
		
	}
	
	@GetMapping("/students")
	public List<Student> get(){
		return stdserv.getAllStudent();
		
	}
	
	@GetMapping("/student/{id}")
	public Optional<Student> getone(@PathVariable ("id") int ids) {
		return stdserv.getStudentById(ids);
		
	}
	
	@PutMapping("/student")
	public Student update(@RequestBody Student std1) {
		 return stdserv.updateStudent(std1);
}
	
}