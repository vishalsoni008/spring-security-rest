package com.springsecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.entity.Users;
import com.springsecurity.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public List<Users> findAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
}
