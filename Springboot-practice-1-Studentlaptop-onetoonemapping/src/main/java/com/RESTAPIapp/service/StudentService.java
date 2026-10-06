package com.RESTAPIapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RESTAPIapp.Repo.StudentRepo;
import com.RESTAPIapp.entity.Laptop;
import com.RESTAPIapp.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo srepo;

	public Student saveStudent(Student std) {
		// TODO Auto-generated method stub
		return srepo.save(std);
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return (List<Student>) srepo.findAll();
	}



	public Student updateStudent(Student std1) {
		// TODO Auto-generated method stub
		return srepo.save(std1);
	}

	public Optional<Student> getStudentById(int ids) {
		// TODO Auto-generated method stub
		return srepo.findById(ids);
	}

//	public Optional<Laptop> getLaptopById(int idds) {
//		// TODO Auto-generated method stub
//		return srepo.findById(idds);
//	}
	

}
