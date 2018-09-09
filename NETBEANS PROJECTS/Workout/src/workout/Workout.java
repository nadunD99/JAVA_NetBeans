/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workout;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 * Date-2016-02-21 
 * @author Nadun
 * 
 */
public class Workout {
    String url= "jdbc:mysql://localhost:3306/fitness";
    String username = "root";
    String password = "";
    
    //INSERT INTO DATABACE
    
    public Boolean add(String date, String time, String duration)
    {
     //SQL STATEMENT
        String query= " INSERT INTO workrecord(Date, Time, Duration) VALUES('"+date+"','"+time+"','"+duration+"')";
        
        try{
            //Get Connection
            Connection conn = (Connection) DriverManager.getConnection(url, username, password);
            
            //Prepaired Statement
            Statement s = (Statement) conn.prepareStatement(query);
            s.execute(query);
            
            return true;
            
            }catch(Exception e)
                {
                    e.printStackTrace();
                    return false;
                }
        
        
        
        
    }
    
    //Retrive Data

    public DefaultTableModel getData()
    {
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Date");
        dm.addColumn("Time");
        dm.addColumn("Duration");
        
        //SQL STatement
        String sql = "SELECT * FROM workrecord;";
            try{
                 Connection conn = (Connection) DriverManager.getConnection(url, username, password);
                
                 //Prepaird stmt and Resultset
                 PreparedStatement s = conn.prepareStatement(sql);
                 s.executeQuery(sql);
                 ResultSet rs = s.executeQuery(sql);
                 
                //Loop through All values
                 while(rs.next())
                     //Get values
                    {
                      String id = rs.getString(1);
                      String Date =rs.getString(2);
                      String Time =rs.getString(3);
                      String Duration = rs.getString(4);
                      
                      dm.addRow(new String[]{id,Date,Time,Duration} );
                    }
                 
                 return dm;
            
                }catch(Exception e )
                    {
                       e.printStackTrace();
                    }
                 return null;
    }
    
    public Boolean Update(String id, String date, String time, String duration)
    {
        //SQL STMT
        String sql= "UPDATE workrecord SET Date='"+date+"',Time='"+time+"',Duration='"+duration+"' where ID ='"+id+"' ;";
        try{
            Connection conn = (Connection) DriverManager.getConnection(url, username, password);
                    
            Statement s=(Statement) conn.prepareStatement(sql);
            
            s.execute(sql);
            
            return true;
            
            }catch(Exception e)
                {
                e.printStackTrace();
                
                return false;
                }        
            
    } 
    
    
   public Boolean delete(String id)
   {
       //SQL
       String sql = " DELETE FROM workrecord where ID = '"+id+"' ;";
       
       try{
           //Get Connection
           Connection conn = (Connection) DriverManager.getConnection(url, username, password);
           //Stmt
           Statement s = (Statement) conn.prepareStatement(sql);
           s.execute(sql);
           
           return true;
           
       }catch(Exception e)
            {
                e.printStackTrace();
                return false;
            }
   }

    
    
}
