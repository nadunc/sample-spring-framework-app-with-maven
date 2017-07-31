/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01.service;

import com.avn.mvn01.model.Employee;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author stephen.silver
 */
public interface EmployeeService {
    public Employee save(Employee employee) throws SQLException;
}
