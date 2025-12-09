package com.technoviral.userservice.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.technoviral.userservice.models.Address;
import com.technoviral.userservice.models.Users;
import com.technoviral.userservice.models.UsersDetails;


@RestController
public class UserController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public UsersDetails getUserDetails() {
		return restTemplate.getForObject("http://user-details-service/usersdetails", UsersDetails.class);
	}
	
	public Address getUserAddress() {
		return restTemplate.getForObject("http://address-service/address", Address.class);
	}
	
	@GetMapping("/users")
	public List<Users> getUsers() {
		UsersDetails userDetails = this.getUserDetails();
		Address address = this.getUserAddress();
		System.out.println("address  "+address.getAddress()+ "  userDetails" + userDetails.getUserBio());
		return Collections.singletonList(new Users( "Prashant", "Giri",  address.getAddress(),  userDetails.getUserBio(), userDetails.getPhone()));
	}
}
