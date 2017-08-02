/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01.service.employee;

import com.avn.mvn01.dao.employee.EmployeeDAO;
import com.avn.mvn01.model.Employee;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author stephen.silver
 * @Document EmployeeServiceImpl
 * @Created on 31/07/2017, 12:32:06 PM
 *
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;
//    @Autowired
//    private 

    @Override
    @Transactional
    public long[] save(Employee employee) throws SQLException {
        long[] arr = new long[2];
        
        arr[0] = employeeDAO.save(employee);
        // arr[1] = systemuserDAO.save(systemuser);
        
        return arr;
    }

}
