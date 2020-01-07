/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.controller;

import com.abs.system.hr.dao.MasterInfoDao;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pAoDEV
 */
@CrossOrigin("*")
@RestController
public class MasterInfoController {

    @Autowired
    MasterInfoDao masterDao;
    
    @ApiOperation(value = "Inquiry employee", notes = "Inquiry employee all")
    @GetMapping(value = {"leave-info"})
    public Object user() {
        return masterDao.getLeaveInfo();
    }
}