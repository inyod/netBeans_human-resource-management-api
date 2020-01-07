/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.domain;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author INYOD
 */
@Getter
@Setter
public final class AuthenticationDomain {
    private Integer uuid;
    private String  first_name;
    private String  last_name;
    private String  username;
    private String  password;
    private String  department_name; 
    private String  phone;
    
    @PostConstruct
    void initialVariable() throws IllegalArgumentException, IllegalAccessException {
        for (Field field : this.getClass().getFields()) {
            field.setAccessible(true);
            field.set(field, null);
        }
    }

    public AuthenticationDomain() {
        try {
            this.initialVariable();
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(AuthenticationDomain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
