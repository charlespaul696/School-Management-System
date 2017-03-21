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
 
public class MarksDAO implements IMarks{
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
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void find(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
