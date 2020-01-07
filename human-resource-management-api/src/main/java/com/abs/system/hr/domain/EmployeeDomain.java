/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.domain;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pAoDEV
 */
@Getter
@Setter
public final class EmployeeDomain implements Serializable{

    private Integer emp_id;
    private String first_name;
    private String last_name;
    private String nick_name;
    private String mobile;
    private String email;
    private String address;
    private String work_start;
    private String test_past;
    private String work_stop;
    private Integer dept_id;
    private String dept_no;
    private String dept_name;
    private Integer position_id;
    private String position_no;
    private String position_name;

    @PostConstruct
    void initialVariable() throws IllegalArgumentException, IllegalAccessException {
        for (Field field : this.getClass().getFields()) {
            field.setAccessible(true);
            field.set(field, null);
        }
    }

    public EmployeeDomain() {
        try {
            this.initialVariable();
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(EmployeeDomain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
