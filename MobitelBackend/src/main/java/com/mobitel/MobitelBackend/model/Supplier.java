package com.mobitel.MobitelBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier {
   
	@Id
	@GeneratedValue
	int supid;
	
	String supname,supdesc;

	public int getSupid() {
		return supid;
	}

	public void setSupid(int supid) {
		this.supid = supid;
	}

	public String getSupname() {
		return supname;
	}

	public void setSupname(String supname) {
		this.supname = supname;
	}

	public String getSupdesc() {
		return supdesc;
	}

	public void setSupdesc(String supdesc) {
		this.supdesc = supdesc;
	}
}
