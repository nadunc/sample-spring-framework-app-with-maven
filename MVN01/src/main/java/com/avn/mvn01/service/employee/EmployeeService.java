/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01.service.employee;

import com.avn.mvn01.model.Employee;
import java.sql.SQLException;

/**
 *
 * @author stephen.silver
 */
public interface EmployeeService {
    public long[] save(Employee employee) throws SQLException;
}
