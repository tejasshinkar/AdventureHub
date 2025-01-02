package com.example.adventureHub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adventureHub.entity.User;
import com.example.adventureHub.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository urepo;
	
	public List<User> getAll(){
		return urepo.findAll();
	}
	
	public User save(User u) {
		return urepo.save(u);
	}
	
	public User login(String email, String password) {
		return urepo.login(email, password);
	}
}
