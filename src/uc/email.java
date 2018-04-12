/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uc;
import javax.swing.*;
/**
 *
 * @author Ritik
 */
public class email extends InputVerifier {
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
        if(jtf.getText().matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Enter a valid Email","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}