package com.in28minutes.springboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService service;

	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String ShowLoginPage( ModelMap model)
	{
		//model.put("name", name);
		//System.out.println("Name is ::::: "+name);
		return "login";
	}
	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public String ShowWelcomePage( ModelMap model, @RequestParam String name,  @RequestParam String password)
	{
		if(!service.validateUser(name, password))
		{
			System.out.println("Incorrect userid or password");
			System.out.println("name is "+name);
			System.out.println("password is "+password);
			model.put("message", "Incorrect Username or Password!");
			return "login";
			
		}
		model.put("name", name);
		System.out.println("Name is ::::: "+name);
		System.out.println("password is "+password);
		return "welcome";
	}
}
