/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package name;

/**
 *
 * @author sk
 */
public class Name {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Nameable guy1 = new Person();
    guy1.setName("Joe");
    Nameable org = new Organization();
    org.setName("PCS");
    Addressable address1 = new Address();
    address1.setAddress("1 Infinite Loop");
    
    
    Nameable guy2 = new Person();
    guy2.setName("Shmeel");
    
    Nameable org2 = new Organization();
    org2.setName("Mealmart");
    
    Addressable address2 = new Address();
    address2.setAddress("500 TunaBagel Street");
    
    System.out.println(guy1.getName());
    System.out.println(org.getName());
    System.out.println(address1.getAddress());
    System.out.println(guy2.getName());
    System.out.println(org2.getName());
   System.out.println(address2.getAddress()); 
    }
    
}
