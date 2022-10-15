package com.springsecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.entity.Admin;
import com.springsecurity.entity.Users;
import com.springsecurity.repository.AdminRepository;
import com.springsecurity.repository.UserRepository;

@Service
public class AdminServices {

	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private UserRepository userRepo;

	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		return adminRepo.findAll();
	}

	public void deleteUser(String email) {
		// TODO Auto-generated method stub
		Users user=userRepo.findByemail(email);
		 userRepo.delete(user);
	}
}
