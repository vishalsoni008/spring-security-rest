package com.springsecurity.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String email;
	
	private String password;
}
