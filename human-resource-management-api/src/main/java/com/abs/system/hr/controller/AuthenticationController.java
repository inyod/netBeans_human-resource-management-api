/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.controller;

import com.abs.system.hr.dao.AuthenticationDao;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author INYOD
 */
@CrossOrigin("*")
@RestController
public class AuthenticationController {

    @Autowired
    AuthenticationDao authenDao;

    @ApiOperation(value = "Login", notes = "Login")
    @PostMapping(value = {"login"})
    public Object login(
            @ApiParam(value = "username", required = true) @NotNull @NotBlank @RequestHeader("username") String username,
            @ApiParam(value = "password", required = true) @NotNull @NotBlank @RequestHeader("password") String password
    ) {
        return authenDao.loginUser(username, password);
    }

}
