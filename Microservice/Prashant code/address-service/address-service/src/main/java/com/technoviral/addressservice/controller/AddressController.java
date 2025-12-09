package com.technoviral.addressservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoviral.addressservice.models.Address;

@RestController
public class AddressController {
	
	@GetMapping("/address")
	public Address getUsers() {
		return new Address( "Yavatmal");
	}
}
