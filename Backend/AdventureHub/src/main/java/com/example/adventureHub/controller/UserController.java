package com.example.adventureHub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.adventureHub.entity.User;
import com.example.adventureHub.entity.UserLoginByEmailAndPassword;
import com.example.adventureHub.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService uservice;
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return uservice.getAll();
	}
	
	@PostMapping("userLogin")
	public User userLogin(@RequestBody UserLoginByEmailAndPassword data) {
		User u= uservice.login(data.getEmail(),data.getPassword());
		if(u!=null)
			return u;
		return null;
	}
}
