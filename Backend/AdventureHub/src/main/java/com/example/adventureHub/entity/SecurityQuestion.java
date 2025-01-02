package com.example.adventureHub.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="securityquestions")
public class SecurityQuestion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int qid;
	String question;
	
	@JsonIgnoreProperties("questions")
	@OneToMany(mappedBy = "questions")
	Set<User> users;
	
	public SecurityQuestion() {
		super();
	}
	
	public SecurityQuestion(int qid, String question, Set<User> users) {
		super();
		this.qid = qid;
		this.question = question;
		for(User u: users)
			u.setQuestions(this);
		this.users = users;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		for(User u: users)
			u.setQuestions(this);
		this.users = users;
	}
}
