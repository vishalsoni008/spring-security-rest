package com.springsecurity.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.entity.Admin;
import com.springsecurity.services.AdminServices;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminServices adminService;
	
//	@GetMapping("/all")
//	public List<Admin> all(){
//		return adminService.findAllAdmin();
//	}
//
//	@DeleteMapping("/deleteUser/{email}")
//	public void deleteUser(@PathVariable("email") String email) {
//		 adminService.deleteUser(email);
//	}

}
