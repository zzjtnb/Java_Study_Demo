package com.zzjt.testbanking;

import com.zzjt.bank1.Account;

public class TestBanking1 {
    public static void main(String[] args) {
        /*
        //声明一个Account类型的对象
        Account account;
        account =new Account(500);
        */
        Account account=new Account(500);
        System.out.println("您的余额为"+account.getBalance()+"元");
        double num= account.withdraw(150);
        System.out.println("您已成功取款"+ num+"元");
        System.out.println("您当前的账户余额为"+account.getBalance()+"元");
        double num2=  account.deposit(22.50);
        System.out.println("您已成功存款"+num2+"元");
        System.out.println("您当前的账户余额为"+account.getBalance()+"元");
        double num3=account.withdraw(47.62);
        System.out.println("您已成功存款"+num3+"元");
        System.out.println("您当前的账户余额为"+account.getBalance()+"元");

    }
}
