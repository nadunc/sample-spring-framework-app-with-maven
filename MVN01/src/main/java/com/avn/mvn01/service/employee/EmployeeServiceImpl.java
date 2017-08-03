/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01.service.employee;

import com.avn.mvn01.dao.employee.EmployeeDAO;
import com.avn.mvn01.dao.systemuser.SystemUserDAO;
import com.avn.mvn01.model.Employee;
import com.avn.mvn01.model.SystemUser;
import java.sql.SQLException;
import java.util.List;
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
    @Autowired
    private SystemUserDAO systemUserDAO;

    @Override
    @Transactional
    public long[] save(Employee employee) throws Exception {
        long[] arr = new long[2];
        long employeeId = employeeDAO.save(employee);
        SystemUser systemUser = new SystemUser();
        systemUser.setEmployeeId(employeeId);
        systemUser.setUserRoleId(1);
        systemUser.setStatus(1);
        
        arr[0] = employeeId;
        arr[1] = systemUserDAO.save(systemUser);

        return arr;
    }

    @Override
    public Employee findById(long employeeId) throws Exception {
        return employeeDAO.findById(employeeId);
    }

    @Override
    public void update(Employee employee) throws Exception {
        employeeDAO.update(employee);
    }

    @Override
    public List<Employee> search(String keyword) throws Exception{
       return employeeDAO.search(keyword);
    }
    
    
    

}
