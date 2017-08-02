/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01.dao.employee;

import com.avn.mvn01.model.Employee;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author stephen.silver
 */
public interface EmployeeDAO {

    public long save(final Employee employee) throws Exception;

    public void update(Employee employee) throws Exception;

    public List<Employee> search(String key) throws Exception;

    public Employee findById(long employeeId) throws Exception;
}
