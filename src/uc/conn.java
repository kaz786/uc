/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uc;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Ritik
 */
public class conn {
    
    public static String url="jdbc:derby://localhost:1527/u_cars";
    public static String drivername ="org.apache.derby.jdbc.ClientDriver";
    public static String username="u_cars";
    public static String password="usha@181";
    public static Connection con;
    public static Statement statement;
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    
    public static Connection getConnection()
    {
        try
        {
            Class.forName(drivername);
            con=DriverManager.getConnection(url, username, password);
         }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}