package com.banking.finapp;

import com.banking.finapp.bank.Bank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FinappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinappApplication.class, args);
	}

}
