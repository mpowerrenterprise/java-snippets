/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2;

/**
 *
 * @author Joker Hacker
 */
import java.sql.*;
import javax.swing.*;

public class App2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        App2 pro=new App2();
        pro.createConncetion();
        
        
    }
    
    void createConncetion(){
    
        try{
        
            Class.forName("com.mysql.jdbc.Driver"); //load the driver
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root",""); //Connection
            System.out.println("The Connection is success");// success msg
            Statement stmt=conn.createStatement(); 
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");
            while(rs.next()){
            
                String name = rs.getString("name");
                System.out.println(name);
            }        
        
        }catch(Exception e){
        
               System.out.println(e);
        
        }
    }
    
}
