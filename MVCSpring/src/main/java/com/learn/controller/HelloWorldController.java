package com.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.learn.Service.UserService;
import com.learn.configuration.User;

@Controller
public class HelloWorldController {

	@Autowired
	UserService userService;
	//testing clone******************************
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(Model model) {
		System.out.println("test!!!!!");
		User u = new User();
		u.setAge(100);
		model.addAttribute("userForm", u);
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "user";
	}

	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(Model model) {
		System.out.println("test again!!!!!");
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
		return "welcome";
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String createUser(@ModelAttribute("userForm") User user, BindingResult result, Model model) {
		System.out.println("test again!!!!!" + user.getUserName());
		userService.createUser(user);
		model.addAttribute("success", "UserCreated Successfully");
		return "success";
	}

}
