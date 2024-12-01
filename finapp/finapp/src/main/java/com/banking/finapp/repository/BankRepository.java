package com.banking.finapp.repository;

import com.banking.finapp.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository
        extends JpaRepository<BankAccount, Long> {
}
