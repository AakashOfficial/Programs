package com.tyagi.EcommerceBackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category
{
@Id
@GeneratedValue
int catid;
String catname,catdesc;
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public String getCatname() {
	return catname;
}
public void setCatname(String catname) {
	this.catname = catname;
}
public String getCatdesc() {
	return catdesc;
}
public void setCatdesc(String catdesc) {
	this.catdesc = catdesc;
}
}
