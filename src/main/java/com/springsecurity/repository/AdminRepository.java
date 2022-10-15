package com.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	//Admin fingByemail(String email);

	Admin findByemail(String email);

	Admin findByname(String name);

}
