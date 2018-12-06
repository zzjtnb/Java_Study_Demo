package com.zzjt.bank2;

public class Customer {

    private String fristName;

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    private String lastName;

    private Account account;
    public Customer(String f,String l){
        fristName=f;
        lastName=l;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
