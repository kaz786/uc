/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uc;
import javax.swing.*;
/**
 *
 * @author dbit
 */
public class fname extends InputVerifier {
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
        if(jtf.getText().matches("^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Enter a valid Name","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}
