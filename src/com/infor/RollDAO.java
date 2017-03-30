/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infor;

import connect.MySqLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author charles
 */
 
public class RollDAO implements IRoll{
    PreparedStatement pre;
    ResultSet result;
    MySqLConnection mySql = new MySqLConnection();
    Connection con = mySql.getConnect();
    @Override
    public void create(Roll obj) {
        try {
            pre = con.prepareStatement("INSERT INTO roll VALUES(?)");
            
           pre.setString(1, obj.getRoll());
           
           
           pre.executeUpdate();
           
            JOptionPane.showMessageDialog(null, " You Have Successfully  ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void find(String id) {
     try {
            pre = con.prepareStatement("SELECT * FROM signup where password = ?");
            pre.setString(1, id);
            pre.executeQuery();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }   
    }

    @Override
    public ArrayList findAll(Roll obj) {
        return findAll(obj);
    }

    @Override
    public void update(Roll obj) {
        try {
            pre = con.prepareStatement("UPDATE roll SET id = ? WHERE id = ?");
            pre.setString(2, obj.getFrname());
            pre.setString(1, obj.getFrname());
          
           
           pre.execute();
         JOptionPane.showMessageDialog(null, " You Have Successfully ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }     
    }

    @Override
    public void delete(String id) {

    }
    
}
