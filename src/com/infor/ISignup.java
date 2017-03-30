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
public interface ISignup {
    public void create(Signup obj);
    public void find(String id);
    public ArrayList findAll(Signup obj);
    public void update(Signup obj);
    public void delete(String id);
}
