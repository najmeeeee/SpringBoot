package com.marian.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.demo.model.Address;
import com.marian.demo.repository.AddressRepository;



@Service
public class AddressService {
	@Autowired
    public AddressRepository addressRepo;
	public List<Address> getAllAddress(){
		return addressRepo.findAll();
	}
	 public Address addNewAddress(Address address) {
	       
	        return addressRepo.save(address);
}
}