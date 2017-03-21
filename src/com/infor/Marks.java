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
public class Marks {
    private String id,subjectid,studentid,clasid,testid;
    private String exams;

    public Marks(String id, String subjectid, String studentid, String clasid, String testid, String exams) {
        this.id = id;
        this.subjectid = subjectid;
        this.studentid = studentid;
        this.clasid = clasid;
        this.testid = testid;
        this.exams = exams;
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

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getExams() {
        return exams;
    }

    public void setExams(String exams) {
        this.exams = exams;
    }

    
    
}
