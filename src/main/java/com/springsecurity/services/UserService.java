package com.springsecurity.services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.springsecurity.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springsecurity.entity.Users;
import com.springsecurity.repository.UserRepository;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<Users> findAllUsers() {
		return userRepository.findAll().stream().collect(Collectors.toList());
	}

	public Users addNewUser(UserRequest userRequest) {

		Users isExist = userRepository.findByEmail(userRequest.getEmail());

		if(isExist != null){
			throw new RuntimeException("user already exist");
		}
		if(userRequest.getName() == null){
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "please enter a valid name");
		}
		if(userRequest.getEmail() == null){
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "please enter a valid email");
		}
		if(userRequest.getPassword() == null){
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "please enter a valid password");
		}

		Users users = new Users();

		users.setName(userRequest.getName());
		users.setEmail(userRequest.getEmail());
		users.setPassword(userRequest.getPassword());

		users.setCreationDate(new Date());

		users = userRepository.save(users);

		return users;
	}
}
