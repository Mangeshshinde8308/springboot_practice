package com.RESTAPIapp.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.RESTAPIapp.entity.Student;
@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {

}
