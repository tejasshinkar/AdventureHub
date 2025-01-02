package com.example.adventureHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adventureHub.entity.SecurityQuestion;

public interface SecurityQuestionRepository extends JpaRepository<SecurityQuestion, Integer> {

}
