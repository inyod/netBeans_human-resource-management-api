/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.dao;

import com.abs.system.hr.constants.SQLConstants;
import com.abs.system.hr.domain.LeaveDomain;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pAoDEV
 */
@Repository
public class MasterInfoDaoImp implements MasterInfoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Object getLeaveInfo() {
        List<LeaveDomain> list = new ArrayList<>();
        try {
            String sql = SQLConstants.QRY_LEAVEINFO;
            list = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper(LeaveDomain.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
