package com.springsecurity.controllers;

import java.util.List;

import com.springsecurity.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springsecurity.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public ResponseEntity allUser(){
		return new ResponseEntity(userService.findAllUsers(), HttpStatus.OK);
	}

	@PostMapping("/")
	public ResponseEntity addNewUser(@RequestBody UserRequest userRequest){
		return new ResponseEntity(userService.addNewUser(userRequest), HttpStatus.CREATED);
	}
}
