package com.example.adventureHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adventureHub.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

//	@Query("insert into users() values()")
}
