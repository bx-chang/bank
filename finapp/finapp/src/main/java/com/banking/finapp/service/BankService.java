package com.banking.finapp.service;

import com.banking.finapp.model.BankAccount;
import com.banking.finapp.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {


    private final BankRepository bankRepository;

    @Autowired
    public  BankService(BankRepository bankRepository){
        this.bankRepository = bankRepository;
    }

    public List<BankAccount> getBanks(){
        return bankRepository.findAll();
    }

    public void addNewBankAccount(BankAccount bankAccount) {
        System.out.println(bankAccount);
        bankRepository.save(bankAccount);
    }
}
