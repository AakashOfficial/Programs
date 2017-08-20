package com.tyagi.EcommerceBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyagi.EcommerceBackend.dao.CartDAO;
import com.tyagi.EcommerceBackend.model.Cart;

public class CartTestCase 
{
public static void main(String[] args)
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.tyagi.EcommerceBackend");
	context.refresh();
	CartDAO cartDAO=(CartDAO)context.getBean("cartDAO");
	Cart cart=new Cart();
	cart.setCartid(1001);
	cart.setProdid(3);
	cart.setProdname("Leggin");
	cart.setPrice(12000);
	cart.setQuantity(6);
	cart.setStatus("N");
	cart.setUsername("Anshika");
	cartDAO.addToCart(cart);
	System.out.println("Added To Cart");
	List<Cart> list=cartDAO.getCartItems("Anshika");
	
	for(Cart cart2:list){
		System.out.println(cart2.getCartid()+";;;");
		System.out.println(cart2.getProdid()+";;;");
		System.out.println(cart2.getProdname()+";;;");
		System.out.println(cart2.getPrice()+";;;");
		System.out.println(cart2.getQuantity()+";;;");
	}
				
}
}
