/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author saba
 */
public class Account {
    String accountNumber;
    String custName;
    String date;
    double balance;
    public Account(String accNum,String custName,String date,double balance){
        this.accountNumber = accNum;
        this.custName = custName;
        this.date = date;
        this.balance = balance;
    }
    
    public void withdraw(double amount){
        this.balance = this.balance-amount;
    }
    
    public void deposite(double amount){
        this.balance = this.balance-amount;
    }
    
    
    public void transfer(Account a,double amount){
        this.withdraw(amount);
        a.deposite(amount);
    }
}
