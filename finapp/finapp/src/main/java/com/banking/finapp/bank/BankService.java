package com.banking.finapp.bank;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BankService {

    public List<Bank> getBanks(){
        return List.of(
                new Bank(
                        1L,
                        "DCB",
                        10000L
                )
        );
    }
}
