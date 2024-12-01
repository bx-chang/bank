package com.banking.finapp.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "credit_card")
public class CreditCard {

    @Id
    @SequenceGenerator(name = "credit_card_seq", sequenceName = "CREDIT_CARD_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "credit_card_seq")
    private long Id;

    private long userId;
    private String cardProvider;
    private String cardNumber;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private String currency;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CreditCard(long id, long userId, String cardNumber, String cardProvider, BigDecimal balance, BigDecimal creditLimit, String currency, LocalDateTime createdAt, LocalDateTime updatedAt) {
        Id = id;
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.cardProvider = cardProvider;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public CreditCard(long userId, String cardProvider, String cardNumber, BigDecimal balance, BigDecimal creditLimit, String currency, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.userId = userId;
        this.cardProvider = cardProvider;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return Id;
    }

    public long getUser_Id() {
        return userId;
    }

    public String getCardProvider() {
        return cardProvider;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setUserId(long user_Id) {
        this.userId = user_Id;
    }

    public void setCardProvider(String cardProvider) {
        this.cardProvider = cardProvider;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "Id=" + Id +
                ", userId=" + userId +
                ", cardProvider='" + cardProvider + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", currency='" + currency + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
