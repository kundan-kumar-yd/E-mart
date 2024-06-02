
package emart.Pojo;


public class UserProfile {

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserProfile.username = username;
    }

    public static String getUsertype() {
        return usertype;
    }

    public static void setUsertype(String usertype) {
        UserProfile.usertype = usertype;
    }

    public static String getUserid() {
        return userid;
    }

    public static void setUserid(String userid) {
        UserProfile.userid = userid;
    }
    private static String username;
    private static String usertype;
    private static String userid;
    
    
}
