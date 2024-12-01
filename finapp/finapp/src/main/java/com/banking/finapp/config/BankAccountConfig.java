package com.banking.finapp.config;


import com.banking.finapp.model.BankAccount;
import com.banking.finapp.repository.BankRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class BankAccountConfig {

    @Bean
    CommandLineRunner commandLineRunner (BankRepository bankRepository){

        return args -> {
            BankAccount ChaseBank = new BankAccount(
                    1L,
                    "Chase Bank",                  // bankName
                    "1234567890",                  // accountNumber
                    "Savings",                     // accountType
                    new BigDecimal("1500.75"),     // balance
                    "USD",
                    LocalDateTime.now(),
                    LocalDateTime.now()// currency
            );
            bankRepository.saveAll(List.of(ChaseBank));
        };

    }
}
