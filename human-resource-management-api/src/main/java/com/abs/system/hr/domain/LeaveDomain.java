/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.domain;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author INYOD
 */
@Getter
@Setter
public class LeaveDomain {
    public Integer  l_reason_id; 
    private String l_reason_name;
    
    public LeaveDomain() {
        this.l_reason_id = null;
        this.l_reason_name = null;
    }
    
}
