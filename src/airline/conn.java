package airline;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  // LOAD DRIVERS
            c = DriverManager.getConnection("jdbc:mysql:///proiect_p3","root","");// LOCATION, ROOT, PASSWORD    
            s =c.createStatement(); //EXECUTING QUERRY
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  