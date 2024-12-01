package com.banking.finapp.controller;


import com.banking.finapp.model.BankAccount;
import com.banking.finapp.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/account")
public class BankController {

    @Autowired
    private final BankService bankService;

    public BankController (BankService bankService){
        this.bankService = bankService;
    }

    @GetMapping
    public List<BankAccount> getBanks(){
        return bankService.getBanks();
    }

    @PostMapping
    public void LinkNewBankAccount(@RequestBody BankAccount bankAccount){
        bankService.addNewBankAccount(bankAccount);

    }


}
