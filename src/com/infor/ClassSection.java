/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infor;

/**
 *
 * @author charles
 */
public class ClassSection {
    private String fterm,studentid,classid;

    public ClassSection(String fterm, String studentid, String classid) {
        this.fterm = fterm;
        this.studentid = studentid;
        this.classid = classid;
    }

    public ClassSection() {
    }

    public String getFterm() {
        return fterm;
    }

    public void setFterm(String fterm) {
        this.fterm = fterm;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

   
    
}
