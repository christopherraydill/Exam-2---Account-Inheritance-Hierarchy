/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account.inheritance.hierarchy;

/**
 *
 * @author cd0814231
 */
public class Account {
    private double balance;
    static double interest = 0.0006;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterest() {
        return interest;
    }

    public static void setInterest(double interest) {
        Account.interest = interest;
    }

    public Account(double balance) {
        this.balance = balance;
    }
        
    // deposit    
    public double credit(double deposit){
        balance += deposit;
        return balance;
    }
    
    //withdraw  
    public double debit(double withdraw){
        if (balance >= 0.0) {
                System.out.println("Debit amount exceeded account balance");
            }
            else
            {
                if (balance >= withdraw) {
                     balance -= withdraw;
                }
                else
                {
                    System.out.println("Debit amount exceeded account balance");
                }
            }
        return balance;
    }
    
    
}
