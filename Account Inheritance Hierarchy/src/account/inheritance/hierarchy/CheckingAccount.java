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
public class CheckingAccount extends Account{
    static double fee = 0.0006;

    public CheckingAccount(double balance) {
        super(balance);
    }
     
     // deposit   
    @Override 
    public double credit(double deposit){
        double number = super.credit(deposit + (deposit * fee));
        System.out.println("Fee amount " + (deposit * fee) + "$");
        return number;
    }
    
    //withdraw 
    @Override
    public double debit(double withdraw){
        double number = super.debit(withdraw + withdraw * fee);
        System.out.println("Fee amount " + (withdraw * fee) + "$");
        return number;
    }
}
