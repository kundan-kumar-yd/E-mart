
package emart.Dao;

import emart.DButil.DBConnection;
import emart.Pojo.UserProfile;
import emart.Pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao {
    
    public static boolean validateUser(UserPojo user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from user where userid=? and password=? and usertype=?");
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUsertype());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            String username=rs.getString(5);
            UserProfile.setUsername(username);
            return true;
        }
        return false;
        
    }
}
