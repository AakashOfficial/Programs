package com.tyagi.EcommerceFrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController 
{
	@RequestMapping("/AboutUs")
	public String showAboutUs()
	{
		return "AboutUs";
	}
	
	@RequestMapping("/login")
	public String showLoginPage()
	{
		return "Login";
	}

	@RequestMapping("/logout")
	public String showLogout()
	{
		return "Main";
	}
	
	@RequestMapping("/Register")
	public String showSignup()
	{
		return "Register";
	}
	
	
	
	@RequestMapping("/ContactUs")
	public String showContact()
	{
		return "ContactUs";
	}
	
	@RequestMapping("/ioo")
	public String showindex()
	{
		return "Main";
	}
	@RequestMapping("/p")
	public String showhead()
	{
		return "Header";
	}

}
