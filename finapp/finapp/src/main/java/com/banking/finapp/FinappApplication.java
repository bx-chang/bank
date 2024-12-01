package com.banking.finapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinappApplication.class, args);
	}

}
