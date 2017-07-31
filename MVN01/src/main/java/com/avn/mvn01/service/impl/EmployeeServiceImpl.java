/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.avn.mvn01.service.impl;

import com.avn.mvn01.dao.employee.EmployeeDAO;
import com.avn.mvn01.model.Employee;
import com.avn.mvn01.service.EmployeeService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;



/**
 *
 * @Author stephen.silver
 * @Document EmployeeServiceImpl
 * @Created on 31/07/2017, 12:32:06 PM

 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;
    
    @Override
    public Employee save(Employee employee) throws SQLException {
        return employeeDAO.save(employee);
    }
    
    

}
