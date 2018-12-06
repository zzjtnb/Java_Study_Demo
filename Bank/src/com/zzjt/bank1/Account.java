package com.zzjt.bank1;
//账户
public class Account {

    //余额
    private double balance;
    //构造器
    public Account(double int_balance){
        balance=int_balance;
    }
    //存款
    public double deposit(double amt){//amt表示要存的额度
        balance+=amt;
        return balance;
    }
    //取款
    public double withdraw(double amt){//amt表示要取的额度
        if(balance>=amt) {
            balance -= amt;
        }else{
            System.out.println("您的余额不足");
        }
        return balance;
    }
    public double getBalance() {
        return balance;
    }

}