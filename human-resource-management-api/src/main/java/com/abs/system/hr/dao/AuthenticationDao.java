/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.dao;

import com.abs.system.hr.domain.AuthenticationDomain;

/**
 *
 * @author INYOD
 */
public interface AuthenticationDao {
    public AuthenticationDomain loginUser (String username,String password);
}
