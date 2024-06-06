import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class NewClass {
    
    
    Connection conn;
    
     void dbCon(){
    
        try{
        
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
           
                    
        }catch(Exception ex){
        
        
            System.out.println(ex);
            
        }
        
    }
    
    public static void main(String[]args){
    
       NewClass nc=new NewClass();
       nc.dbCon();
       nc.addBatches();
    }
    
    void addBatches(){
        
        try{
           
           Statement stmt = conn.createStatement();
           stmt.addBatch("INSERT INTO user2(name,username,password) VALUES('user1','name1','pass1')");
           stmt.addBatch("INSERT INTO user2(name,username,password) VALUES('user1','name1','pass1')");
           stmt.addBatch("INSERT INTO user2(name,username,password) VALUES('user1','name1','pass1')");
           stmt.addBatch("INSERT INTO user2(name,username,password) VALUES('user1','name1','pass1')");
           stmt.addBatch("INSERT INTO user2(name,username,password) VALUES('user1','name1','pass1')");
           stmt.addBatch("INSERT INTO user2(name,username,password) VALUES('user1','name1','pass1')");
           
           
           int [] ar = stmt.executeBatch();
           
            for (int i : ar) {
                
                System.out.println(i);
            }
           
           
       
       }catch(Exception ex){
       
           System.out.println(ex);
       }
    }
    
}
