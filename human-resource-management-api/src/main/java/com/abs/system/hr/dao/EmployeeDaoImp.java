/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.dao;

import com.abs.system.hr.constants.SQLConstants;
import com.abs.system.hr.domain.DataForHRDomain;
import com.abs.system.hr.domain.DataForHeaderDomain;
import com.abs.system.hr.domain.EmployeeDomain;
import com.abs.system.hr.domain.LeaveUserDomain;
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
public class EmployeeDaoImp implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Object getEmployee(String uid) {
        List<EmployeeDomain> list = new ArrayList<>();
        try {
            String sql = SQLConstants.QRY_EMPLIYEE;
            if (uid == null || uid.trim().equals("")) {
                sql = sql.replace(":[CONDITIONS]", "");
            } else {
                sql = sql.replace(":[CONDITIONS]", "AND emp.emp_id IN(" + (uid.trim().startsWith(",") ? (uid.trim().replaceFirst(",", "")) : uid.trim()) + ")");
            }
            list = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper(EmployeeDomain.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Object getLeaveUser(String empid) {
        List<LeaveUserDomain> list = new ArrayList<>();
        try {
            String sql = SQLConstants.QRY_LEAVEUSER;
            if (empid == null || empid.trim().equals("")) {
                sql = sql.replace(":[CONDITIONS]", "");
            } else {
                sql = sql.replace(":[CONDITIONS]", "AND el.emp_id IN(" + (empid.trim().startsWith(",") ? (empid.trim().replaceFirst(",", "")) : empid.trim()) + ")");
            }
            list = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper(LeaveUserDomain.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    @Override
    public Object getDataForHR(String datahr) {
        List<DataForHRDomain> list = new ArrayList<>();
        try {
            String sql = SQLConstants.QRY_DATAFORHR;
            if (datahr == null || datahr.trim().equals("")) {
                sql = sql.replace(":[CONDITIONS]", "");
            } else {
                sql = sql.replace(":[CONDITIONS]", "AND emp.emp_id IN(" + (datahr.trim().startsWith(",") ? (datahr.trim().replaceFirst(",", "")) : datahr.trim()) + ")");
            }
            list = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper(DataForHRDomain.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Object getDataForHeader(String datahd) {
        List<DataForHeaderDomain> list = new ArrayList<>();
        try {
            String sql = SQLConstants.QRY_DATAFORHEADER;
            if (datahd == null || datahd.trim().equals("")) {
                sql = sql.replace(":[CONDITIONS]", "");
            } else {
                sql = sql.replace(":[CONDITIONS]", "AND emp.emp_id IN(" + (datahd.trim().startsWith(",") ? (datahd.trim().replaceFirst(",", "")) : datahd.trim()) + ")");
            }
            list = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper(DataForHeaderDomain.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }    
}
