package com.zzjt.testbanking;

import com.zzjt.bank2.Account;
import com.zzjt.bank2.Customer;

public class TestBanking2 {
    public static void main(String[] args) {
        Customer customer;
        Account account;
        account=new Account(500);
        //
        customer=new Customer("海", "大");
        customer.setAccount(account);
        System.out.println(customer);
    }
}
