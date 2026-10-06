package com.RESTAPIapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RESTAPIapp.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
	

}
