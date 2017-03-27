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
 
public class ClassDAO implements IMarks{
    PreparedStatement pre;
    ResultSet result;
    MySqLConnection mySql = new MySqLConnection();
    Connection con = mySql.getConnect();
    @Override
    public void create(Marks obj) {
        try {
            pre = con.prepareStatement("INSERT INTO marksstore VALUES(?,?,?,?,?,?)");
            
           pre.setString(1, obj.getId());
           pre.setString(2, obj.getStudentid());
           pre.setString(3, obj.getSubjectid());
           pre.setString(4, obj.getClasid());
           pre.setString(5, obj.getTestid());
           pre.setString(6, obj.getExams());
           
           pre.executeUpdate();
           
            JOptionPane.showMessageDialog(null, " You Have Successfully Registered Student Number  "+obj.getStudentid());
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
    public ArrayList findAll(Marks obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Marks id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
