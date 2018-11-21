package com.form.demo;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegisterUserApplication implements CommandLineRunner {
		
	@Autowired
	RegistrationUserRepo formrespository;

	public static void main(String[] args) {
		SpringApplication.run(RegisterUserApplication.class, args);
	}
	
	@Override
	public void run(String...  args) {
		formrespository.findAll();
	}
}
