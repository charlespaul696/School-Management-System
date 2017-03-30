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
public class Test {
    private String studentid,classid,departid,subid,classSection;
    private int ca1,ca2,c3;

    public Test(String studentid, String classid, String departid, String subid, String classSection, int ca1, int ca2, int c3) {
        this.studentid = studentid;
        this.classid = classid;
        this.departid = departid;
        this.subid = subid;
        this.classSection = classSection;
        this.ca1 = ca1;
        this.ca2 = ca2;
        this.c3 = c3;
    }

    public Test() {
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

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid;
    }

    public String getSubid() {
        return subid;
    }

    public void setSubid(String subid) {
        this.subid = subid;
    }

    public String getClassSection() {
        return classSection;
    }

    public void setClassSection(String classSection) {
        this.classSection = classSection;
    }

    public int getCa1() {
        return ca1;
    }

    public void setCa1(int ca1) {
        this.ca1 = ca1;
    }

    public int getCa2() {
        return ca2;
    }

    public void setCa2(int ca2) {
        this.ca2 = ca2;
    }

    public int getC3() {
        return c3;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }
    
    
}
