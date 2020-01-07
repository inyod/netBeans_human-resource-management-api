/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abs.system.hr.constants;

/**
 *
 * @author pAoDEV
 */
public class SQLConstants {

    public static String QRY_EMPLIYEE = "SELECT emp.emp_id, emp.first_name, emp.last_name, emp.nick_name, emp.mobile, emp.email, emp.address, emp.work_start, emp.test_past, emp.work_stop, emp.dept_id, dpm.dept_no, dpm.dept_name, emp.position_id, dpmp.position_no, dpmp.position_name FROM employee_info emp, department dpm, department_position dpmp WHERE emp.delete_date IS NULL :[CONDITIONS] AND emp.dept_id = dpm.dept_id AND emp.position_id = dpmp.position_id";
    public static String QRY_LEAVEINFO = "SELECT leave_reason_id AS l_reason_id,leave_reason_name AS l_reason_name FROM leave_reason";
    public static String QRY_LEAVEUSER = "SELECT el.emp_id, ei.first_name, ei.last_name, lr.leave_reason_id, lr.leave_reason_name, lt.leave_type_id, lt.leave_type_name, dmp.dept_id, dmp.dept_name, emp_leave_id, leave_remark, dpp.position_id, dpp.position_name, DATE_FORMAT( leave_date, \" %d/%m/%Y %H:%i\" ) leave_date, DATE_FORMAT( leave_start_time, \" %d/%m/%Y %H:%i\" ) leave_start_time, DATE_FORMAT( leave_stop_time, \" %d/%m/%Y %H:%i\" ) leave_stop_time, DATE_FORMAT( head_approve_date, \" %d/%m/%Y %H:%i\" ) head_approve_date, DATE_FORMAT( hr_approve_date, \" %d/%m/%Y %H:%i\" ) hr_approve_date FROM employee_leave el, employee_info ei, leave_type lt, leave_reason lr, department dmp, department_position dpp WHERE ei.emp_id = el.emp_id AND el.leave_type_id = lt.leave_type_id AND el.leave_reason_id = lr.leave_reason_id AND ei.dept_id = dmp.dept_id AND ei.position_id = dpp.position_id :[CONDITIONS] GROUP BY el.emp_leave_id";
    public static String QRY_DATAFORHR = "SELECT el.emp_id, ei.first_name, ei.last_name, lr.leave_reason_id, lr.leave_reason_name, lt.leave_type_id, lt.leave_type_name, dmp.dept_id, dmp.dept_name, emp_leave_id, leave_remark, dpp.position_id, dpp.position_name, DATE_FORMAT(leave_date,\" %d/%m/%Y %H:%i\") leave_date, DATE_FORMAT(leave_stop_time,\" %d/%m/%Y %H:%i\") leave_stop_time, DATE_FORMAT(leave_start_time,\" %d/%m/%Y %H:%i\") leave_start_time, DATE_FORMAT(head_approve_date,\" %d/%m/%Y %H:%i\") head_approve_date, DATE_FORMAT(hr_approve_date,\" %d/%m/%Y %H:%i\") hr_approve_date FROM employee_leave el, employee_info ei, leave_type lt, leave_reason lr, department dmp, department_position dpp WHERE ei.emp_id = el.emp_id AND el.leave_type_id = lt.leave_type_id AND el.leave_reason_id = lr.leave_reason_id AND ei.dept_id = dmp.dept_id AND ei.position_id = dpp.position_id GROUP BY el.emp_leave_id";
    public static String QRY_DATAFORHEADER = "SELECT el.emp_id, ei.first_name, ei.last_name, lr.leave_reason_id, lr.leave_reason_name, lt.leave_type_id, lt.leave_type_name, dmp.dept_id, dmp.dept_name, emp_leave_id, leave_remark, dpp.position_id, dpp.position_name, DATE_FORMAT( leave_date, \" %d/%m/%Y %H:%i\" ) leave_date, DATE_FORMAT( leave_stop_time, \" %d/%m/%Y %H:%i\" ) leave_stop_time, DATE_FORMAT( leave_start_time, \" %d/%m/%Y %H:%i\" ) leave_start_time, DATE_FORMAT( head_approve_date, \" %d/%m/%Y %H:%i\" ) head_approve_date, DATE_FORMAT( hr_approve_date, \" %d/%m/%Y %H:%i\" ) hr_approve_date FROM employee_leave el, employee_info ei, leave_type lt, leave_reason lr, department dmp, department_position dpp WHERE ei.emp_id = el.emp_id AND el.leave_type_id = lt.leave_type_id AND el.leave_reason_id = lr.leave_reason_id AND ei.dept_id = dmp.dept_id AND ei.position_id = dpp.position_id GROUP BY el.emp_leave_id";
    public static String QRY_USERLOGIN = "SELECT emp_id AS uuid,first_name,Last_name,email AS username FROM employee_info WHERE email=? AND `password`=?";
}
