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
 
public  class FacultyDAO implements IFaculty{
    PreparedStatement pre;
    ResultSet result;
    MySqLConnection mySql = new MySqLConnection();
    Connection con = mySql.getConnect();
    @Override
    public void create(Faculty obj) {
        try {
            pre = con.prepareStatement("INSERT INTO faculty VALUES(?,?,?)");
            
           pre.setString(1, obj.getId());
           pre.setString(2, obj.getName());
           pre.setString(3, obj.getDeparidf());
          
           
           pre.executeUpdate();
           
            JOptionPane.showMessageDialog(null, " You Have Successfully Registered ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void find(String id) {
     try {
            pre = con.prepareStatement("SELECT * FROM finacial where id = ?");
            pre.setString(1, id);
            pre.executeQuery();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }   
    }

    @Override
    public ArrayList findAll(Faculty obj) {
    return findAll(obj);
    }

    @Override
    public void update(Faculty obj) {
        try {
            pre = con.prepareStatement("UPDATE faculty SET name = ?,Department_id = ?  WHERE id = ?");
            pre.setString(3, obj.getId());
           pre.setString(1, obj.getId());
           pre.setString(2, obj.getDeparidf());
           
           pre.execute();
         JOptionPane.showMessageDialog(null, " You Have Successfully UpDated ");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }     
    }

    @Override
    public void delete(String id) {
    }
    
}
