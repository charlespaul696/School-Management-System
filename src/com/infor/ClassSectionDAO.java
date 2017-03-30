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
 
public class ClassSectionDAO implements IClassSection{
    PreparedStatement pre;
    ResultSet result;
    MySqLConnection mySql = new MySqLConnection();
    Connection con = mySql.getConnect();
    @Override
    public void create(ClassSection obj) {
        try {
            pre = con.prepareStatement("INSERT INTO classsection VALUES(?,?,?)");
            
         //  pre.setString(1, obj.getId());
           pre.setString(1, obj.getFterm());
           pre.setString(2, obj.getStudentid());
           pre.setString(3, obj.getClassid());
          
           
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
    public ArrayList findAll(ClassSection obj) {
    return findAll(obj);
    }

    @Override
    public void update(ClassSection obj) {
        try {
            pre = con.prepareStatement("UPDATE classsection SET id = ?,Class_id = ?  WHERE Student_id = ?");
            
           pre.setString(3, obj.getStudentid());
           pre. setString(1, obj.getFterm());
           pre.setString(2, obj.getClassid());
           
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
