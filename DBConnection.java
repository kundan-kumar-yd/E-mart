
package emart.DButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection {
   private static Connection conn;
   static
   {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/grocery","root","kundan");    
       }
       catch(ClassNotFoundException ex)
       {
           JOptionPane.showMessageDialog(null, "Error in loading the Driver","Driver error",JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
           System.exit(1);
       }
       catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null, "Error in Opening Connection","Opening error",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
           System.exit(1);
       }
   }
   public static Connection getConnection(){
       return conn;
   }
    public static void closeConnection(){
        try
        {
            conn.close();
        }
         catch(SQLException e)
       {
           JOptionPane.showMessageDialog(null, "Error in Closing Connection","Closing error",JOptionPane.ERROR_MESSAGE);
           e.printStackTrace();
  
       }
    }
}
