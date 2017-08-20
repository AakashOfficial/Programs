package com.tyagi.EcommerceFrontend.controller;

import java.util.LinkedHashMap;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tyagi.EcommerceBackend.dao.SupplierDAO;
import com.tyagi.EcommerceBackend.model.Supplier;

@Controller
public class SupplierController 
{
	
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@RequestMapping("/Supplier")
	public String showSupplier(Model m)
	{
		
		
		Supplier supplier=new Supplier();
		
		m.addAttribute("supplist",this.getSuppList());
		m.addAttribute("supplier",supplier);
		
		List<Supplier> supplist=supplierDAO.getSupplierDetails();
		m.addAttribute("supplist",supplist);
		
		
		return "Supplier";
	}
	
	

	@RequestMapping(value="/InsertSupplier",method=RequestMethod.POST)
	public String insertSupplier(@ModelAttribute("supplier") Supplier supplier,Model m)
	{
		System.out.println("---Supplier Inserted---");
		supplierDAO.insertUpdateSupplier(supplier);	
		
		List<Supplier> supplist=supplierDAO.getSupplierDetails();
		m.addAttribute("supplist",supplist);
		
		return "Supplier";
	}
	
	@RequestMapping(value="/updateSupplier/{suppid}")
	public String updateSupplier(@PathVariable("suppid")int suppid,Model m)
	{
		
		Supplier supplier=supplierDAO.getSupplier(suppid);
		m.addAttribute("supplier",supplier);
		
		List<Supplier> supplist=supplierDAO.getSupplierDetails();
		m.addAttribute("supplist",supplist);
		
		return "redirect:/Supplier";
	}
	
	@RequestMapping(value="/deleteSupplier/{suppid}")
	public String deleteSupplier(@PathVariable("suppid")int suppid,Model m)
	{
		
		Supplier supplier=supplierDAO.getSupplier(suppid);
		supplierDAO.deleteSupplier(supplier);
		
		Supplier supplier1=new Supplier();
		m.addAttribute("supplier",supplier);
		
		List<Supplier> supplist=supplierDAO.getSupplierDetails();
		m.addAttribute("supplist", supplist);
		
		return "Supplier";
	}
	
	public LinkedHashMap<Integer,String> getSuppList()
	{
		List<Supplier> list=supplierDAO.getSupplierDetails();
		
		LinkedHashMap<Integer,String> supplist=new LinkedHashMap<Integer,String>();
		
		for(Supplier supp:list)
		{
			supplist.put(supp.getSuppid(),supp.getSuppaddress());
		}
		
		return supplist;
	}
	
	
	
	
}