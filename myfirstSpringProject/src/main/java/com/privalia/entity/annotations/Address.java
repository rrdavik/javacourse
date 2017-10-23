package com.privalia.entity.annotations;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
   private int idAddress;
   private String street;
   
   public Address(){
	   
   }
   
   
	public Address(int idAddress, String street) {
		this.idAddress = idAddress;
		this.street = street;
	}
	
	public int getIdAddress() {
		return idAddress;
	}
	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	   
   
}
