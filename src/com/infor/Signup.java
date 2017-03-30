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
public class Signup {
  private String frname,lasname,usname,paword,roll;

    public Signup(String frname, String lasname, String usname, String paword, String roll) {
        this.frname = frname;
        this.lasname = lasname;
        this.usname = usname;
        this.paword = paword;
        this.roll = roll;
    }

    public Signup() {
    }

    public String getFrname() {
        return frname;
    }

    public void setFrname(String frname) {
        this.frname = frname;
    }

    public String getLasname() {
        return lasname;
    }

    public void setLasname(String lasname) {
        this.lasname = lasname;
    }

    public String getUsname() {
        return usname;
    }

    public void setUsname(String usname) {
        this.usname = usname;
    }

    public String getPaword() {
        return paword;
    }

    public void setPaword(String paword) {
        this.paword = paword;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
  
  
  
}
