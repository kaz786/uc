/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uc;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Ritik
 */
public class mob extends InputVerifier {
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
        if(jtf.getText().matches("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Enter a valid Mobile Number","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}
