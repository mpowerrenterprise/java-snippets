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
           
          PreparedStatement stmt=conn.prepareStatement("INSERT INTO user2(name,username,password) VALUES(?,?,?)");
          stmt.setString(1, "user1");
          stmt.setString(2,"usernmae1");
          stmt.setString(3,"Programming");
          stmt.addBatch();
          
          stmt.setString(1, "user1");
          stmt.setString(2,"usernmae1");
          stmt.setString(3,"Programming");
          stmt.addBatch();
          
          stmt.setString(1, "user1");
          stmt.setString(2,"usernmae1");
          stmt.setString(3,"Programming");
          stmt.addBatch();
          
          stmt.setString(1, "user1");
          stmt.setString(2,"usernmae1");
          stmt.setString(3,"Programming");
          stmt.addBatch();
          
          stmt.setString(1, "user1");
          stmt.setString(2,"usernmae1");
          stmt.setString(3,"Programming");
          stmt.addBatch();
           
           int [] ar = stmt.executeBatch();
           
            for (int i : ar) {
                
                System.out.println(i);
            }
           
           
       
       }catch(Exception ex){
       
           System.out.println(ex);
       }
    }
    
}
