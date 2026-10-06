package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepo;
import com.example.entity.User;

@Service
public class UserServ {
	
  @Autowired
	private UserRepo urepo;
	
	public User saveuser(User user) {
		return urepo.save(user);
		
	}

}
