package com.ecomm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecomm.entity.User;

@Controller
public class PageController 
{
	@RequestMapping("/Login")
	public String showLoginPage()
	{
		System.out.println("LogIn page Created");
		return "Login";
	}
	
	@RequestMapping("/Register")
	public String showRegisterPage(Model m)
	{
		User user= new User();
		m.addAttribute("customer", user);
		System.out.println("Register Page Created");
		
		return "Register";
	}
	 
	    @RequestMapping("/HomePage")
	    public String showHomepage()
	    {
	    	System.out.println("Homepage Created");
	        return "UserHome";
	    }
	
}
