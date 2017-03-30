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
 
public class ClassDAO implements Iclass{
    PreparedStatement pre;
    ResultSet result;
    MySqLConnection mySql = new MySqLConnection();
    Connection con = mySql.getConnect();
    @Override
    public void create(Class obj) {
        try {
            pre = con.prepareStatement("INSERT INTO class VALUES(?,?)");
            
           pre.setString(1, obj.getId());
           pre.setString(2, obj.getName());
          
           
           pre.executeUpdate();
           
            JOptionPane.showMessageDialog(null, " You Have Successfully  ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void find(String id) {
     try {
            pre = con.prepareStatement("SELECT * FROM marksstore where id = ?");
            pre.setString(1, id);
            pre.executeQuery();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }   
    }

    @Override
    public ArrayList findAll(Class obj) {
        return findAll(obj);
    }

    @Override
    public void update(Class obj) {
        try {
            pre = con.prepareStatement("UPDATE student SET name = ? WHERE id = ?");
           pre.setString(2, obj.getId());
           pre.setString(1, obj.getName());
           
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
