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
public class Address  implements  Addressable {
     
     private HasAddress myAddress = new HasAddress();
    
    public void setAddress(String address)
    {
        myAddress.setAddress(address);
    }
    
    public String getAddress() {
        return myAddress.getAddress(); 
        
    }

}

