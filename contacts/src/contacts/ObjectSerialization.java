package contacts;

import java.awt.Color;
import java.io.*;
import javax.swing.*;

//take this code and make it not hardcoded- with swing components- that lets people save 
//code and enter than own name and stuff and save it to file
public class ObjectSerialization {
    String name;
    String address;
    String phone;
    String fileName = "contactlist.bin";
    /**
     *
     */
    public ObjectSerialization() {
        
/*        JFrame frame = new JFrame();
        frame.setSize(700,700);
        frame.setBackground(Color.black);
        
        JPanel panel = new JPanel();
        panel.setSize(500,500);
        panel.setBackground(Color.blue);
        
       frame.add(panel); */
       JOptionPane pane = new JOptionPane();
       pane.setSize(500, 500);
       pane.setBackground(Color.black);
 //      frame.add(pane);
 //      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 //      frame.setVisible(true);
    
    

  //    Contacts p = new Contacts( name,  address, phone);
     
     name = JOptionPane.showInputDialog(null,"Please enter your name");
     address = JOptionPane.showInputDialog(null, "Please enter your address"); 
     phone = JOptionPane.showInputDialog(null, "Please enter your phone number");  
        
       
        
        
        
        
  //  Contacts bo = new Contacts("Barack Obama", "1600 Penn Ave", "888-888-8888");
  //  Contacts gb = new Contacts("George Bush", "800 Texas ave", "777-777-7777");
    
 //   System.out.println(bo.toString());
  //  System.out.println(gb.toString());
    
       
            Contacts p = new Contacts(name, address, phone);
            p.setName(name);
            p.setAddress(address);
            p.setPhone(phone);
           
          //  Contacts q = new Contacts("Bob Shmoe", "25 Shmoe Street","222-222-2222");
            
            try {
                
            ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName)));
            oos.writeObject(p);
            oos.close();
            System.out.println("Saved to Contactlist.bin");
            }
            catch (IOException ex) {
              System.err.println(ex.getMessage());  
        }
    
            try {
            ObjectInputStream ois = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream(fileName)));
            Contacts r = (Contacts)ois.readObject();
            ois.close();
         
            System.out.println(p.getName().toString());
            System.out.println(p.getAddress().toString());
            System.out.println(p.getPhone().toString());
            
            System.out.println(r.getName().toString());
            System.out.println(r.getAddress().toString());
            System.out.println(r.getPhone().toString());
            
          
        }
        catch(IOException | ClassNotFoundException ex) {
              System.err.println(ex.getMessage());  
        }
    }
    
      public static void main(String[] args) { 
          new ObjectSerialization();
      }
}

