/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.dao;

import com.abs.system.hr.constants.SQLConstants;
import com.abs.system.hr.domain.AuthenticationDomain;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author INYOD
 */
@Repository
public class AuthenticationDaoImp implements AuthenticationDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public AuthenticationDomain loginUser(String username, String password) {
        List<AuthenticationDomain> list = new ArrayList<>();
        AuthenticationDomain authen = null;
        try {
            String sql = SQLConstants.QRY_USERLOGIN;
            list = jdbcTemplate.query(sql, new Object[]{username,password}, new BeanPropertyRowMapper(AuthenticationDomain.class));
            System.out.println("aaa");
            for (AuthenticationDomain auth : list) {
                authen = auth;
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return authen;
    }

}
