package com.dphone.signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dphone.signup.bean.Login;
import com.dphone.signup.bean.Registration;

@Controller
public class SignUpController {
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("In welcome page");
		return "welcome";
	}
	
	@RequestMapping("/registration")
	public String register(@ModelAttribute Registration register, Model model) {
		System.out.println("In the registration page");
		System.out.println(register);
		return "registration";
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute Login login, Model model) {
		System.out.println("In the registration page");
		System.out.println(login);
		return "login";
	}
}
