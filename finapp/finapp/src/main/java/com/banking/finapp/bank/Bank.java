package com.banking.finapp.bank;


public class Bank {
    private Long id;
    private String name;
    private Long deposit;

    public Bank(){

    }

    public Bank(Long id, String name, Long deposit) {
        this.id = id;
        this.name = name;
        this.deposit = deposit;
    }

    public Bank(String name, Long deposit){
        this.name = name;
        this.deposit = deposit;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getDeposit() {
        return deposit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deposit=" + deposit +
                '}';
    }
}
