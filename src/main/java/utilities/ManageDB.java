package utilities;

import java.sql.DriverManager;


public class ManageDB extends CommonOps{

    public static void openConnection(String dbURL, String user, String password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dbURL, user, password);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Error occurred while Connecting to DC, See details:" + e);
        }
    }
    public static void closeConnection(){
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Error occurred while Closing DC, See details:" + e);
        }
    }
}
