package com.banking.finapp.controller;

import com.banking.finapp.model.CreditCard;
import com.banking.finapp.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cards")
public class CreditCardController {

    private final CreditCardService creditCardService;

    @Autowired
    public CreditCardController(CreditCardService creditCardService){
        this.creditCardService = creditCardService;
    }

    @GetMapping
    public List<CreditCard> getCreditCardsDetails(){
        return creditCardService.getCreditCardDetails();
    }
}
