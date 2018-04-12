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
public class age extends InputVerifier {
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
        if(jtf.getText().matches("[\\p{Digit}&&[1234567890]]+"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Enter a valid Number","Error",JOptionPane.ERROR_MESSAGE);
            
            return false;
        }
    

    }

    }