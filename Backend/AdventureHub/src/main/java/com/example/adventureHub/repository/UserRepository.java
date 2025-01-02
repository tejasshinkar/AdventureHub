package com.example.adventureHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.adventureHub.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

//	@Query("select * from users where email=?1 , password=?2")
	@Query("from User where email=?1 and password=?2")
	public User login(String email, String password);
}
