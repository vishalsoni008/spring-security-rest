package com.springsecurity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.entity.Users;
import com.springsecurity.services.UserService;



@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public List<Users> allUser(){
		return userService.findAllUser();
	}
}
