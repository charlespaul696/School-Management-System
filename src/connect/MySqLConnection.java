/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charles
 */
public class MySqLConnection {
private  Connection connect; 
private static MySqLConnection mySQLConnection;
private static String url =  "jdbc:mysql://localhost:3306/schoolsystem";
    private static String user = "root";
    private static String password = "charles";

public MySqLConnection(){
    try {
        connect = DriverManager.getConnection(url, user, password);
    } catch (SQLException ex) {
    ex.printStackTrace();
    }
}
public Connection getConnect()
    {
        
        return connect;
    }
public static MySqLConnection getInstance(){
    if(mySQLConnection == null)
    {
        mySQLConnection = new MySqLConnection();
    }
    return mySQLConnection;
}
    

}
