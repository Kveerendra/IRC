/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javadesktopirc;

import java.io.IOException;
import javax.swing.text.BadLocationException;

/**
 *
 * @author veerendra
 */
public class JavaDesktopIrc  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, BadLocationException {
        
        SecureVirus s = new SecureVirus();
        s.setVisible(true);
        IRC i = new IRC(s);
    }
    
}
