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
         JOptionPane.showMessageDialog(null, " You Have Successfully Registered Student Number  "+obj.getId());
        } catch (SQLException ex) {
//            ex.printStackTrace();
               JOptionPane.showMessageDialog(null, "Error Massage \n Please Enter numbers for Phone number \n"
                       + "Make Sure you fill up the fields before you Submit..");
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
    
        return findAll(obj);
    }

    @Override
    public void update(Students obj) {
      try {
            pre = conntecting.prepareStatement("UPDATE student SET firstName = ?,lastName = ?,otherName = ?,gender = ?,age = ?, state = ?, religion = ?,address = ?,phonenumber = ?,email = ?,Department_id = ? WHERE ID = ?");
           pre.setString(12, obj.getId());
           pre.setString(1, obj.getFname());
           pre.setString(2, obj.getLname());
           pre.setString(3, obj.getOname());
           pre.setString(4, obj.getGender());
           pre.setString(5, obj.getAge());
           pre.setString(6, obj.getState());
           pre.setString(7, obj.getReligion());
           pre.setString(8, obj.getAddress());
           pre.setString(9, obj.getPhone());
           pre.setString(10, obj.getEmail());
           pre.setString(11, obj.getDepartmentid());
           
           pre.execute();
         JOptionPane.showMessageDialog(null, " You Have Successfully UpDated Student Number  "+obj.getId());
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error Massage \n Please Enter numbers for Phone number \n"
                       + "Make Sure you fill up the fields before you Submit..");
        }   
    }

    @Override
    public void delete(String id) {

    }

    
}
