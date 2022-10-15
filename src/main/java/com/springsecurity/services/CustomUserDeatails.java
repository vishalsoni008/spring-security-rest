package com.springsecurity.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.entity.Users;
import com.springsecurity.repository.UserRepository;

@Service
public class CustomUserDeatails implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Users users=userRepo.findByname(name);
		return new User(users.getName(), users.getPassword(), new ArrayList<>());
	}

}
