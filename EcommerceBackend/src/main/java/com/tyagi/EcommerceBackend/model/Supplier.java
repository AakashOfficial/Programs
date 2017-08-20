package com.tyagi.EcommerceBackend.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier
{
	@Id
	@GeneratedValue
    int suppid;
    String suppname,suppaddress;
	public int getSuppid() {
		return suppid;
	}
	public void setSuppid(int suppid) {
		this.suppid = suppid;
	}
	public String getSuppname() {
		return suppname;
	}
	public void setSuppname(String suppname) {
		this.suppname = suppname;
	}
	public String getSuppaddress() {
		return suppaddress;
	}
	public void setSuppaddress(String suppaddress) {
		this.suppaddress = suppaddress;
	}
    
}
