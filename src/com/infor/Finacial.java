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
public class Finacial {
    private String id,subjectid,studentid,clasid,terns;
    private String amount;

    public Finacial(String id, String subjectid, String studentid, String terns, String amount) {
        this.id = id;
        this.subjectid = subjectid;
        this.studentid = studentid;
        this.terns = terns;
        this.amount = amount;
    }

    public Finacial() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(String subjectid) {
        this.subjectid = subjectid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getClasid() {
        return clasid;
    }

    public void setClasid(String clasid) {
        this.clasid = clasid;
    }

    public String getTerns() {
        return terns;
    }

    public void setTerns(String terns) {
        this.terns = terns;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    
    
}
