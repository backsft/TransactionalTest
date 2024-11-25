package com.TransactionalTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionalTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionalTestApplication.class, args);
		System.out.println("Program started");
	}

}
