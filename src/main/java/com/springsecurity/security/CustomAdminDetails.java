//package com.springsecurity.security;
//
//import com.springsecurity.entity.Admin;
//import com.springsecurity.repository.AdminRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//@Service
//public class CustomAdminDetails implements UserDetailsService{
//
//	@Autowired
//	private AdminRepository adminRepo;
//
//	@Override
//	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		Admin admin=adminRepo.findByname(name);
//
//		return new User(admin.getName(), admin.getPassword(), new ArrayList<>());
//	}
//
//}
