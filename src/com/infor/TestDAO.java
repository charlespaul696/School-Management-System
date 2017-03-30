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
 
public class TestDAO implements ITest{
    PreparedStatement pre;
    ResultSet result;
    MySqLConnection mySql = new MySqLConnection();
    Connection con = mySql.getConnect();
    @Override
    public void create(Test obj) {
        try {
            pre = con.prepareStatement("INSERT INTO tests VALUES(?,?,?,?,?,?,?,?)");
            
         //  pre.setString(1, obj.getId());
           pre.setString(1, obj.getStudentid());
           pre.setString(2, obj.getClassid());
           pre.setString(3, obj.getDepartid());
           pre.setString(4, obj.getSubid());
            pre.setString(5, obj.getClassSection());
           pre.setInt(6, obj.getCa1());
           pre.setInt(7, obj.getCa2());
           pre.setInt(8, obj.getC3());
           
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
    public ArrayList findAll(Test obj) {
    return findAll(obj);
    }

    @Override
    public void update(Test obj) {
        try {
            pre = con.prepareStatement("UPDATE student SET  Student_id= ?,Class_id = ?,Department_id = ?,Sbuject_id = ?,ClassSection_id = ?,CAT1 = ?, CAT2 = ?,CAT3 = ? WHERE Student_id = ?");
            pre.setString(8, obj.getStudentid());
           pre.setString(1, obj.getClassid());
           pre.setString(2, obj.getDepartid());
           pre.setString(3, obj.getSubid());
           pre.setString(4, obj.getClassSection());
           pre.setInt(5, obj.getCa1());
           pre.setInt(6, obj.getCa2());
           pre.setInt(7, obj.getC3());
           
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
