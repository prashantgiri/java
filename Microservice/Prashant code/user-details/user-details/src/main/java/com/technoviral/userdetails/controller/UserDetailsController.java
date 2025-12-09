package com.technoviral.userdetails.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.technoviral.userdetails.models.UsersDetails;

@RestController
public class UserDetailsController {
	

	@GetMapping("/usersdetails")
	public UsersDetails getUsers() {
		return new UsersDetails("Java student",  "8007505850");
	}
}
