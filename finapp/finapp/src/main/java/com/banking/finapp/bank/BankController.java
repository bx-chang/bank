package com.banking.finapp.bank;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/bank")
public class BankController {

    @Autowired
    private final BankService bankService;

    public BankController (BankService bankService){
        this.bankService = bankService;
    }

    @GetMapping
    public List<Bank> getBanks(){
        return bankService.getBanks();
    }


}
