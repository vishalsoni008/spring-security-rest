package com.springsecurity.securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springsecurity.services.CustomAdminDetails;
import com.springsecurity.services.CustomUserDeatails;

@Configuration
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private CustomUserDeatails cud;
	
	@Autowired
	private CustomAdminDetails cad;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(auth);
		auth.userDetailsService(cad);
		auth.userDetailsService(cud);	
	}

	
	
	
	@Bean
	public PasswordEncoder password() {
		return NoOpPasswordEncoder.getInstance();
	}
}
