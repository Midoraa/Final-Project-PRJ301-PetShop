/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public interface DBConnect {
 //Quang  
    public static String serverName = "LAPTOP-7UOA152U\\SQLEXPRESS";
    public static String dbName = "PetshopDB";
    public static String portNumber = "1433";
    public static String userID = "sa";
    public static String password = "kungkimp3";
//Khoa    
//    public static String serverName = "DESKTOP-0748AC0\\SQLEXPRESS";
//    public static String dbName = "PetshopDB";
//    public static String portNumber = "1433";
//    public static String userID = "sa";
//    public static String password = "123456789";
//Bao
    //
    public static Connection getConnection() {
        try {
            String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, userID, password);
        } catch (Exception e) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

//    Test connection
    public static void main(String[] args) {
        try {
            if (DBConnect.getConnection() != null) {
                System.out.println("Connect successfully!");
            } else {
                System.out.println("Connect failed!");
            }
        } catch (Exception ex) {
            System.out.println(ex);
            System.out.println("Error at model.DBContext.DBContext().getConnertion()");
        }
//System.out.println(checkUserNameExist("trumquang2002"));
        
    }
    


}
    


