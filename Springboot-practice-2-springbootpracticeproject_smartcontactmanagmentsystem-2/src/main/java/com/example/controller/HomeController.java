package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.dao.UserRepo;
import com.example.entity.User;
import com.example.helper.Message;
import com.example.service.UserServ;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	@Autowired
	private UserServ userv;

	@GetMapping("/")
	public String homepage(Model model) {

		model.addAttribute("title", "Home-smart contact system");
		return "home";

	}

	@GetMapping("/about")
	public String aboutpage(Model model) {

		model.addAttribute("about", "Home-smart contact system");
		return "about";

	}

	@GetMapping("/signup")
	public String singpage(Model model) {

		model.addAttribute("title", "Register-Smart Contact Manager");
		model.addAttribute("user", new User());
		return "signup";

	}
// handler for registering user
	@PostMapping("/do_register")
	public String registerUser(@Valid @ModelAttribute("user") User user,BindingResult result,
			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model
			  ,HttpSession session) {
		try {
			if (!agreement) {
				System.out.println("You have not agreed the term and condition");
				throw new Exception("You have not agreed the term and condition");
			}
			
			if(result.hasErrors())
			{
				System.out.println("ERROR"+ result.toString());
				model.addAttribute("user",user);
				return "singup";
			}
			user.setRole("ROLE_USER");
			user.setEnable(true);
		

			System.out.println("USER" + user);

			userv.saveuser(user);

			model.addAttribute("user", new User());
			session.setAttribute("message", new Message("successfully Registered!!!", "alert-success"));

			return "signup";
		} catch (Exception e) {
		e.printStackTrace();
		model.addAttribute("user",user);
		session.setAttribute("message", new Message("Something went wrong !!!"+e.getMessage(), "alert-danger"));
		return "signup";
		}

	}
}
