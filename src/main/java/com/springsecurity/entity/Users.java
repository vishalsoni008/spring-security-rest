package com.springsecurity.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "users")
public class Users {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String email;

	private String password;

	private Date creationDate;

	private Date updateDate;
}
