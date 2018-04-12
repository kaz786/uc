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
public class dob extends InputVerifier {
    public boolean verify(JComponent input)
    {
        JTextField jtf=(JTextField)input;
        if(jtf.getText().matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(input,"Enter a valid Format DD/MM/YYYY","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}
