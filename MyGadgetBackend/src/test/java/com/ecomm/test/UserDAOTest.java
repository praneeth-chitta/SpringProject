package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.UserDAO;
import com.ecomm.entity.User;

public class UserDAOTest 
{static UserDAO UserDAO;

@BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	context.scan("com.ecomm");
	context.refresh();
	
	UserDAO=(UserDAO)context.getBean("UserDAO");
}

@Test
public void registerUserTest()
{
	User user = new User();
	
	user.setUsername("prathyusha");
	user.setCustomerName("chitta prathyusha");
	user.setGender("F");
	user.setContactNumber("8332886462");
	user.setEmailId("prathyusha@gmail.com");
	user.setAddress("machilipatanam");
	user.setEnabled(true);
	user.setPassword("12345");
	user.setrPassword("12345");
	user.setRole("ROLE_USER");
	
	assertTrue("Problem occured while Registering User:",UserDAO.registerUser(user));
	
}
}	