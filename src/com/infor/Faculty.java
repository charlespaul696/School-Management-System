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
public class Faculty {
    private String id,name,deparidf;

    public Faculty(String id, String name, String deparidf) {
        this.id = id;
        this.name = name;
        this.deparidf = deparidf;
    }

    public Faculty() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeparidf() {
        return deparidf;
    }

    public void setDeparidf(String deparidf) {
        this.deparidf = deparidf;
    }

    


    
}
