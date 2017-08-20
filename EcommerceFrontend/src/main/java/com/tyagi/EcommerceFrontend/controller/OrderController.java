package com.tyagi.EcommerceFrontend.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyagi.EcommerceBackend.dao.CartDAO;
import com.tyagi.EcommerceBackend.dao.ProductDAO;
import com.tyagi.EcommerceBackend.model.Cart;

@Controller
public class OrderController
{
@Autowired
CartDAO cartDAO;
@Autowired
ProductDAO productDAO;


@RequestMapping("/checkout")
public String orderConfirm(HttpSession session,Model m)
{
	String username=(String)session.getAttribute("username");
	List<Cart> list=cartDAO.getCartItems(username);
	int grandtotal=0;
	for(Cart cart:list)
	{
		grandtotal=grandtotal+(cart.getQuantity()*cart.getPrice());
	}
	m.addAttribute("grandtotal",grandtotal);
	m.addAttribute("cartitems",list);
	return "OrderConfirm";
}
}
