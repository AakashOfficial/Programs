package com.mobitel.MobitelBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.ProductDAO;
import com.mobitel.MobitelBackend.model.Product;



public class ProductTestCase {

	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		// Inserting a Product Object.
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		
		//Insertion TestCase
		
		Product product=new Product();
		
		product.setProname("WIFIMobile");
		product.setProdesc("This Mobile is WIFI Enabled. You can Enjoy Internet");

		productDAO.insertUpdateProduct(product);		
		System.out.println("Product Inserted");
		
		//Retrieval TestCase
		
		/*Product product=ProductDAO.getProduct(2);
		System.out.println("Product Name:"+product.getProname());
		System.out.println("Product Description:"+product.getProdesc());*/
		
		//Deletion TestCase
		/*Product product=ProductDAO.getProduct(2);
		ProductDAO.deleteProduct(product);
		System.out.println("The Product Deleted");*/
		
		//Retrieving the Data
		
		/*List<Product> list=ProductDAO.getProductDetails();
		
		for(Product product:list)
		{
			System.out.println(product.getProid()+":"+product.getProname()+":"+product.getProdesc());
		}*/
		
		//Update the Product
		/*Product product=ProductDAO.getProduct(3);
		product.setProname("WifiEnMobile");
		ProductDAO.insertUpdateProduct(product);
		System.out.println("The Product Updated");*/
		
	}
}