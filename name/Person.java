
package name;

public class Person implements Nameable, Addressable {
    private HasName myName = new HasName();
    private HasAddress myAddress = new HasAddress();
    
    public void setName(String name)
    {
        myName.setName(name);
    }
    
    public String getName()
    {
        return myName.getName();
    } 

    
    public void  setAddress(String address) {
        myAddress.setAddress(address);
    }

    
    public String getAddress() {
        return myAddress.getAddress(); 
        
    }
}