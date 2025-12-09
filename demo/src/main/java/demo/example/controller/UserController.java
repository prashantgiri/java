package demo.example.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.example.models.Users;


@RestController
public class UserController {
	
	@GetMapping(value = "/users")
	public List<Users> getUsers() {
		return Collections.singletonList(new Users( "Prashant", "Giri",  "Yavatmal",  "Java student",  "8007505850"));
	}
}
