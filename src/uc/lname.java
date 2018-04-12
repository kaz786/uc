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
public class lname extends InputVerifier {
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
        if(jtf.getText().matches("^[#.0-9a-zA-Z\\s,-]+$"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Enter a valid Address","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}