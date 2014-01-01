package bank5;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Bank5 implements Printable {
    public static void main(String[] args) {
//First create the new arraylist with Account objects named accounts        
        ArrayList <Account> accounts = new ArrayList <Account> ();
//Create Bobs checking account with 0 balance        
        Account bobsAccount = new Checking(0, "bob");
//Add transaction to Bobs Account of 10000 cents        
        bobsAccount.addTransaction(10000);
//add Bobs account to arraylist accounts        
        accounts.add(bobsAccount);
//Create Joes savings account        
        Account joesAccount = new Saving(0, "joe");
//Add transaction to Joes saving account of 10000 cents        
        joesAccount.addTransaction(10000);
//Add Joes account to ArrayList        
        accounts.add(joesAccount);
        
        
        Account stevesAccount = new Saving (0, "steve");
        stevesAccount.addTransaction(100000);
//You need to add steves account to arraylist accounts to allow it to access
//end of month method in checking and savings classes.
        accounts.add(stevesAccount);
//For all accounts in ArrayList accounts , call endOfMonth function in
//Class Account
        Printable marksAccount = new Saving (0, "mark");
        for(Account acc : accounts) {
            acc.endOfMonth();
        }
//Get and print balances for all accounts in Arraylist accounts.        
        for(Account acc : accounts) {
              System.out.println(acc.getBalance());
                bobsAccount.printAccount();
                joesAccount.printAccount();
                stevesAccount.printAccount();
            
            
        }
        
        Scanner scanner;
        scanner = new Scanner(System.in);
        String choice = "y";
        String c;
        String s;
        System.out.println("Would you like to open an account y/n:");
        String yes = scanner.nextLine();
        while(!choice.equalsIgnoreCase("n"))
        {
            System.out.println("Type checking for checking or saving for"
                    + " saving");
            String type = scanner.nextLine();
            
            if (type.equalsIgnoreCase("c"))   {
                System.out.println("You chose a checking account.Please"
                        + "enter a name for your account");
                String accountName  = scanner.nextLine();
                Account accountName1 = new Checking (0, accountName);
                System.out.println("Please select a transaction amount");
                        int deposit = scanner.nextInt();
                        accountName1.addTransaction(deposit);
                        accounts.add(accountName1);
                        for (Account acc: accounts) {
                            accountName1.endOfMonth();
                            accountName1.printAccount();
           
                        }           
            }             
            else if (type.equalsIgnoreCase("s")) {
                System.out.println("you chose a savings account.Please enter a"
                + " name for your account");
                String accountName  = scanner.nextLine();
                Account accountName2 = new Saving (0, accountName);
                System.out.println ("please enter a transaction amount");
                int deposit = scanner.nextInt();
                accountName2.addTransaction(deposit);
                accounts.add(accountName2);
                    for (Account acc: accounts) {
                        accountName2.endOfMonth();
                        accountName2.printAccount();
                        
                }
            }
        }
    }
}
            
                                
            
               
         
                  
         
                
         


   
   
    
     
      



