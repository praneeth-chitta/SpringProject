package com.ecomm.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecomm.dao.UserDAO;
import com.ecomm.entity.User;

@Controller
public class UserController 
{
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(value="/Login_success",method=RequestMethod.POST)
	public String loginSuccess(HttpSession session)
	{
		String page="";
		
		System.out.println("Login is Successful");
		
		SecurityContext sContext = SecurityContextHolder.getContext();
		Authentication authentication = sContext.getAuthentication();
		
		String username = authentication.getName();
		session.setAttribute("username", username);
		
		Collection<GrantedAuthority> roles = (Collection<GrantedAuthority>)authentication.getAuthorities();
		
		for(GrantedAuthority role:roles)
		{
			session.setAttribute("role", role.getAuthority());
			
			if(role.getAuthority().equals("ROLE_ADMIN"))
				page="AdminHome";
			else
				page="UserHome";
		}
		
		return page;
	}
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public String signUp(@ModelAttribute("customer")User user,Model m)
	{
		
		user.setEnabled(true);
		user.setRole("ROLE_USER");
		
		m.addAttribute("customer", user);
		
		userDAO.registerUser(user);
		
		System.out.println("Confirm sign up page created");
		
		return "ConfirmSignUp";
	}
}
