package com.tyagi.EcommerceFrontend.controller;

import java.util.Collection;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tyagi.EcommerceBackend.dao.CartDAO;
import com.tyagi.EcommerceBackend.dao.ProductDAO;
import com.tyagi.EcommerceBackend.dao.UserDAO;
import com.tyagi.EcommerceBackend.model.Product;
import com.tyagi.EcommerceBackend.model.Supplier;
import com.tyagi.EcommerceBackend.model.UserRegister;
import com.sun.org.apache.bcel.internal.generic.RETURN;

@Controller
public class UserController {
	
	
	public UserController() {
		System.out.println("User controller----");
	}

	@RequestMapping("/login_success")
	public String loginsuccess(HttpSession session) {
		System.out.println("loded successfully");
		String page = "null";
		boolean loggedIn = true;

		String username = SecurityContextHolder.getContext().getAuthentication().getName();

		session.setAttribute("username", username);
		session.setAttribute("loggedIn", loggedIn);

		@SuppressWarnings("unchecked")
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		for (GrantedAuthority role : authorities) {
			System.out.println("Role:" + role.getAuthority() + "username" + username);

			if (role.getAuthority().equals("USER")) {

				return "AdminHome";
			} else {
				return "UserHome";
			}
		}
		return "page";
	}
}