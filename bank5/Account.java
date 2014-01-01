/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank5;

/**
 *
 * @author sk
 */
public abstract class Account extends Bank5 implements Printable  {
    private int balance;
 //Account constructor    
    public Account (int startingBalance, String type) {
    addTransaction(startingBalance);
    
}
//EndofMonth function which is defined in checking and savings classes    
    public void endOfMonth() {
        System.out.print("You have reached the end of the month");
        System.out.print("Thank you for your business");        
        
    }
//Under refactor you can encapsulate fields which automatically sets getters and
//setters for the variable    
    public int getBalance() {
        return balance;
    }
//method which adds transaction    
    public void addTransaction (int amount) {
        balance +=amount;
    }        
 public void printAccount () {
       System.out.println("This account has a balance of"); 
       System.out.println(getBalance());
   }
}    
