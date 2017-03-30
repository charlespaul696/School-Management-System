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
public interface IClassSection {
    public void create(ClassSection obj);
    public void find(String id);
    public ArrayList findAll(ClassSection obj);
    public void update(ClassSection obj);
    public void delete(String id);
}
