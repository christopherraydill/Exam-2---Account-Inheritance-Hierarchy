/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account.inheritance.hierarchy;

import java.util.ArrayList;

/**
 *
 * @author cd0814231
 */
public class AccountInheritanceHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Account> accounts = new ArrayList<Account>();
        Account aAccount = new Account(3000);
        aAccount.credit(400);
        aAccount.debit(400);
        
        SavingsAccount sAccount = new SavingsAccount(3000);
        sAccount.credit(400);
        sAccount.debit(400);
        sAccount.CalculateInterest();
        
        CheckingAccount cAccount = new CheckingAccount(3000);
        cAccount.credit(400);
        cAccount.debit(400);
        
        accounts.add(aAccount);
        accounts.add(sAccount);
        accounts.add(cAccount);
        
        for (Account account: accounts) {
            System.out.println(account.getBalance() + "/n");
        }
        
    }
    
}
