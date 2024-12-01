package com.banking.finapp.repository;

import com.banking.finapp.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepository
        extends JpaRepository<CreditCard, Long> {

}
