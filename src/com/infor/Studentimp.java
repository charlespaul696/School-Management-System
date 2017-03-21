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

/**
 *
 * @author charles
 */
public class Studentimp implements Istudent{
    MySqLConnection mysql = new MySqLConnection();
    Connection conntecting = mysql.getConnect();
    PreparedStatement  pre;
    ResultSet re;
    
    @Override
    public void create(Students obj) {
        try {
            pre = conntecting.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
           
           pre.setString(1, obj.getId());
           pre.setString(2, obj.getFname());
           pre.setString(3, obj.getLname());
           pre.setString(4, obj.getOname());
           pre.setString(5, obj.getGender());
           pre.setString(6, obj.getAge());
           pre.setString(7, obj.getState());
           pre.setString(8, obj.getReligion());
           pre.setString(9, obj.getAddress());
           pre.setString(10, obj.getPhone());
           pre.setString(11, obj.getEmail());
           pre.setString(12, obj.getDepartmentid());
           
           pre.executeUpdate();
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
      
    }

    @Override
    public void find(String id) {
        try {
            pre = conntecting.prepareStatement("SELECT * FROM student where id = ?");
            pre.setString(1, id);
            pre.executeQuery();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
    }

    @Override
    public ArrayList findAll(Students obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Students id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
