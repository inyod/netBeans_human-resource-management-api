/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.dao;

/**
 *
 * @author pAoDEV
 */
public interface EmployeeDao {

    public Object getEmployee(String uid);
    public Object getLeaveUser(String empid);
    public Object getDataForHR(String datahr);
    public Object getDataForHeader(String datahd);
}
