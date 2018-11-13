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
public class SavingsAccount extends Account{

    public SavingsAccount(double balance) {
        super(balance);
    }
    
    public double CalculateInterest() {
        return super.interest * getBalance();
    }
    
    @Override 
    public double credit(double deposit){
       return super.credit(deposit);
    }
    
    @Override 
    public double debit(double withdraw){
       return super.credit(withdraw);
    }
}
