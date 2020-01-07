/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author INYOD
 */
@Getter
@Setter
public final class DataForHRDomain implements Serializable {

    private Integer emp_id;
    private String  first_name;
    private String  last_name;
    private String  leave_type_name;
    private String  position_name;
    private String  dept_name;
    private String  leave_reason_name;
    private Integer emp_leave_id;
    private String  leave_date;
    private Integer leave_type_id;
    private String  leave_remark;
    private String  leave_start_time;
    private String  leave_stop_time;
    private String  head_approve_date;
    private String  hr_approve_date;
    
    @PostConstruct
    void initialVariable() throws IllegalArgumentException, IllegalAccessException {
        for (Field field : this.getClass().getFields()) {
            field.setAccessible(true);
            field.set(field, null);
        }
    }

    public DataForHRDomain() {
        try {
            this.initialVariable();
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(DataForHRDomain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
