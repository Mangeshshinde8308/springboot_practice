package com.RESTAPIapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RESTAPIapp.entity.Employee;
import com.RESTAPIapp.repository.EmployeeRepo;

@Service
public class EmployeeServ {
	
	@Autowired
	private EmployeeRepo erepo;

	public Employee saveEmployee(Employee emp) {
		Employee emp1=this.erepo.save(emp);
		return emp1;
	}

	public List<Employee> findAllEmployee() {
		List<Employee> emp=(List<Employee>) erepo.findAll();
		return emp;
	}

	public Optional<Employee> getEmployeeById(int ids) {
		// TODO Auto-generated method stub
		return erepo.findById(ids);
	}

	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return erepo.save(emp);
	}
	
	

}
