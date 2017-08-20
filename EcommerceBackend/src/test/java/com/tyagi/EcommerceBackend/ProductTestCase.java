package com.tyagi.EcommerceBackend;

import javax.naming.Context;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyagi.EcommerceBackend.dao.CategoryDAO;
import com.tyagi.EcommerceBackend.dao.ProductDAO;
import com.tyagi.EcommerceBackend.model.Category;
import com.tyagi.EcommerceBackend.model.Product;

public class ProductTestCase {



	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.tyagi.EcommerceBackend");
		context.refresh();

	ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");

		
	Product product=new Product();

	product.setProdname("Jeans");
	product.setQuantity(3);
	product.setProddesc("Be Branded");

	productDAO.insertUpdateProduct(product);		
	System.out.println("product Inserted");

	//Retrieval TestCase

	/*Product product=productDAO.getProduct(2);
	System.out.println("Product Name:"+product.getCatname());
	System.out.println("Product Description:"+product.getCatdesc());

	//Deletion TestCase
	Product product=productDAO.getProduct(2);
	productDAO.deleteProduct(product);
	System.out.println("The Product Deleted");

	//Retrieving the Data

	List<Product> list=productDAO.getProductDetails();

	for(Product product:list)
	{
		System.out.println(product.getCatid()+":"+product.getCatname()+":"+product.getCatdesc());
	}


	Product product=productDAO.getProduct(1);
	product.setCatname("Shirt");
	productDAO.insertUpdateProduct(product);
	System.out.println("The Product Updated");*/

	}
	}
