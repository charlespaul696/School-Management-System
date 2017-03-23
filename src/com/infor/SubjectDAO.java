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
 
public abstract class SubjectDAO implements ISubject{
    PreparedStatement pre;
    ResultSet result;
    MySqLConnection mySql = new MySqLConnection();
    Connection con = mySql.getConnect();

    @Override
    public void create(Subject obj) {
        try {
            pre = con.prepareStatement("SELECT * FROM sbuject");
            pre.setString(1, obj.getId());
            pre.setString(2, obj.getName());
            pre.setString(3, obj.getUnit());
            pre.executeUpdate();
             JOptionPane.showMessageDialog(null, " You Have Successfully Registered Subject Number  "+obj.getId());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void find(String id) {
        try {
            pre = con.prepareStatement("SELECT * FROM sbuject WHERE id = ?");
            pre.setString(1, id);
            pre.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList findAll(Subject obj) {
        return findAll(obj);
    }

    @Override
    public void update(Subject id) {
       try {
            pre = con.prepareStatement("UPDATE sbuject SET id = ?, name = ?, units = ? WHERE id = ?");
            pre.setString(3, id.getId());
            pre.setString(1, id.getName());
            pre.setString(2, id.getUnit());
            pre.execute();
             JOptionPane.showMessageDialog(null, " You Have Successfully UpDated Subject Number  "+id.getId());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }  
    }

    @Override
    public void delete(String id) {
   
    }
    
}
