package com.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	Users findByname(String name);

	Users findByEmail(String email);
}
