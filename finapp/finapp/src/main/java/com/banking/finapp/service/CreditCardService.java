package com.banking.finapp.service;


import com.banking.finapp.model.CreditCard;
import com.banking.finapp.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {

    private final CreditCardRepository creditCardRepository;

    @Autowired
    public CreditCardService(CreditCardRepository creditCardRepository){
        this.creditCardRepository = creditCardRepository;
    }


    public List<CreditCard> getCreditCardDetails() {
        return creditCardRepository.findAll();
    }
}
