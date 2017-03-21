/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infor;

import java.util.ArrayList;

/**
 *
 * @author charles
 */
public interface Istudent {
    public void create(Students obj);
    public void find(String id);
    public ArrayList findAll(Students obj);
    public void update(Students id);
    public void delete(String id);
}
