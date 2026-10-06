package com.RESTAPIapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RESTAPIapp.entity.Employee;
import com.RESTAPIapp.service.EmployeeServ;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServ eSer;
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee emp) {
		
		Employee emp1=eSer.saveEmployee(emp);
		System.out.println("The above employee saved in Database"+emp1);
		return emp1;
		
	}
	
	@GetMapping("/employees")
	public List<Employee> get() {
		List<Employee> emp2=eSer.findAllEmployee();
		return emp2;
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getById(@PathVariable("id")  int ids) {
		return eSer.getEmployeeById(ids);
		
	}
	
	@PutMapping("/employee")
	public Employee update(@RequestBody Employee emp) {
		return eSer.updateEmployee(emp);
		
	}
	

}
