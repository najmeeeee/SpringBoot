package com.marian.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.marian.demo.model.Address;
import com.marian.demo.service.AddressService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AddressController {

    @Autowired
    public AddressService addressService;

    
    @GetMapping("/api/address")
    public List<Address> showAllAddress() {
        return addressService.getAllAddress();
    }

    
    @PostMapping("/api/address")
    public  Address addAllAddress(@RequestBody Address address){
    	return addressService.addNewAddress(address);
    }
}
