package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.User;

@Controller
public class HomeController {
	
	@GetMapping("/index")
	public String indexpage() {
		return "index";
		
	}
  @PostMapping("/register")
  public String userRegister(@ModelAttribute User user) {
	
	  
	  System.out.println(user);
	  return "index";
	  
  }
}
