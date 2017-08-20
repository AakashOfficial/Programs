package com.mobitel.MobitelBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.UserDAO;
import com.mobitel.MobitelBackend.model.User;

public class UserTestCase {

	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		// Inserting a User Object.
		UserDAO userDAO=(UserDAO)context.getBean("userDAO");
		
		//Insertion TestCase
		
		User user=new User();
		user.setUsername("MrTyagi");
		user.setPassword("Bhai");
        user.setFirstname("Aakash");
        user.setLastname("Tyagi");
        user.setAddress("Hapur");
        user.setEmailID("19aakash33@gmail.com");
		userDAO.insertUpdateUser(user);		
		System.out.println("User Inserted");
		
		//Retrieval TestCase
		
		/*User user=UserDAO.getUser(2);
		System.out.println("User Name:"+user.getUsername());
		System.out.println("User Description:"+user.getUserdesc());*/
		
		//Deletion TestCase
		/*User user=UserDAO.getUser(2);
		UserDAO.deleteUser(user);
		System.out.println("The User Deleted");*/
		
		//Retrieving the Data
		
		/*List<User> list=UserDAO.getUserDetails();
		
		for(User user:list)
		{
			System.out.println(user.getUserid()+":"+user.getUsername()+":"+user.getUserpassword());
		}*/
		
		//Update the User
		/*User user=UserDAO.getUser(3);
		user.setUsername("WifiEnMobile");
		UserDAO.insertUpdateUser(user);
		System.out.println("The User Updated");*/
		
	}
}

