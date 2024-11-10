/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NNN
 */import java.sql.*;
public class coonector
{
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydata","root","118921");
            return con;
        }
        catch(Exception e)
        {

            System.out.println(e);
            return null;
        }
    }
}
 
