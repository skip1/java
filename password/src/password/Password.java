/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package password;
import javax.swing.JOptionPane;
/**
 *
 * @author sk
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        
        if (
                (username != null && password != null) &&
                (
        
                    (username.equals ("shmeg") && password.equals ("swordfish"))
                    || (username.equals ("joe") && password.equals ("joey"))
                )
           )       
        { JOptionPane.showMessageDialog
                                            (null, "you're in");
        }else {
            JOptionPane.showMessageDialog
                                             (null, "you're suspicious");
        }                
    }
    
}
