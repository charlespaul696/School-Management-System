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
 
public class FinacialDAO implements Ifinacial{
    PreparedStatement pre;
    ResultSet result;
    MySqLConnection mySql = new MySqLConnection();
    Connection con = mySql.getConnect();
    @Override
    public void create(Finacial obj) {
        try {
            pre = con.prepareStatement("INSERT INTO finacial VALUES(?,?,?,?)");
            
         //  pre.setString(1, obj.getId());
           pre.setString(1, obj.getStudentid());
           pre.setString(2, obj.getClasid());
           pre.setString(3, obj.getTerns());
           pre.setString(4, obj.getAmount());
           
           pre.executeUpdate();
           
            JOptionPane.showMessageDialog(null, " You Have Successfully Registered Student Number  "+obj.getStudentid());
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
    public ArrayList findAll(Finacial obj) {
    return findAll(obj);
    }

    @Override
    public void update(Finacial obj) {
        try {
            pre = con.prepareStatement("UPDATE student SET Class_id = ?,TermSection_id = ?,amount = ? WHERE Student_id = ?");
           pre.setString(4, obj.getStudentid());
           pre.setString(1, obj.getClasid());
           pre.setString(2, obj.getTerns());
           pre.setString(3, obj.getAmount());
           
           pre.execute();
         JOptionPane.showMessageDialog(null, " You Have Successfully UpDated Student Number  "+obj.getStudentid());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }     
    }

    @Override
    public void delete(String id) {
    }
    
}
