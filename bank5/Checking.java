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
   public class Checking extends Account // implements Printable
   {
//This subclass has a constructor similar to the one in Account       
     public Checking(int startingBalance, String accountName) {
//super here refers to the starting balance in parent.i.e Account class         
        super(startingBalance, accountName);
    }
//defines end of month method for checking-takes off 1000 cents $10 dollars
//if theres less than 1000 dollars in account     
   public void endOfMonth() {
       if (getBalance() < 100000) {
           addTransaction (-1000);
       }
   }
 }
  //   @Override
  // public void printAccount () {
   //    System.out.println("This checking account has a balance of:"); 
   //    System.out.println(getBalance());
  // }
   
   
