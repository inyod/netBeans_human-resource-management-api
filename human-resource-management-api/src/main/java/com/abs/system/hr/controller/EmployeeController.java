/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.controller;

import com.abs.system.hr.dao.EmployeeDao;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pAoDEV
 */
@CrossOrigin("*")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @ApiOperation(value = "Inquiry employee", notes = "Inquiry employee all")
    @GetMapping(value = {"employee", "admin/employee"})
    public Object user() {
        return employeeDao.getEmployee(null);
    }

    @ApiOperation(value = "Inquiry employee", notes = "Inquiry employee by ID")
    @ApiParam(value = "{id}", required = true)
    @GetMapping(value = {"employee/{id}", "admin/employee/{id}"})
    public Object user(@PathVariable("id") String uid) {
        return employeeDao.getEmployee(uid);
    }

    @ApiOperation(value = "Inquiry employee", notes = "การดึงข้อมูลการลาจาก 1 User")
    @ApiParam(value = "{empid}", required = true)
    @GetMapping(value = {"leaveuser/{empid}"})
    public Object leaveUser(@PathVariable("empid") String empid) {
        return employeeDao.getLeaveUser(empid);
    }

    @ApiOperation(value = "Inquiry employee", notes = "การดึงข้อมูลการลาจาก 1 User")
    @GetMapping(value = {"leaveuser"})
    public Object leaveUser() {
        return employeeDao.getLeaveUser(null);
    }

    @ApiOperation(value = "Inquiry employee", notes = "data for hr")
    @GetMapping(value = {"dataForHR"})
    public Object dataForHR() {
        return employeeDao.getDataForHR(null);
    }

    @ApiOperation(value = "Inquiry employee", notes = "data for header")
    @GetMapping(value = {"dataForHeader"})
    public Object dataForHeader() {
        return employeeDao.getDataForHeader(null);
    }
}
