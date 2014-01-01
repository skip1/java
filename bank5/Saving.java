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
public class Saving extends Account //implements Printable
{
//This subclass has a constructor similar to the ones in Account and Checking    
    public Saving (int startingBalance, String accountName) {
//super refers to the startingBalance in super-Account class        
        super(startingBalance, accountName);
    }
//defines endOfMonth for Savings account give 2 percent interest.Switched
//to double to allow decimals from interest    
    @Override
   public void endOfMonth() {
     double interest = getBalance() *.02;
     addTransaction((int)interest);
   }
//    @Override
//   public void printAccount (){
  //     System.out.println("This savings account has a balance of");
   //    System.out.println(getBalance());
   }

