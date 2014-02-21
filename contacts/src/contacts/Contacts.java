/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contacts;

import java.io.Serializable;

/**
 *
 * @author sk
 */
public class Contacts implements Serializable{
    private String name;
    private String address;
    private String phone;
   

    
public Contacts(String name, String address, String phone) {
    this.name = name;
    this.address = address;
    this.phone = phone;
}




    public String getName() {
      
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
  
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
       
        this.phone = phone;
    }

    
    public String toString() {
        return "name:       " + name + "\n" +
               "address:    " + address + "\n" +
               "phone:      " + phone + "\n";
    }
    
    


   
    
    
    

}