package com.marian.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String phoneno;
private String email;
private String address;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int id, String name, String phoneno, String email, String address) {
	super();
	this.id = id;
	this.name = name;
	this.phoneno = phoneno;
	this.email = email;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Address [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", email=" + email + ", address=" + address
			+ "]";
}


}
