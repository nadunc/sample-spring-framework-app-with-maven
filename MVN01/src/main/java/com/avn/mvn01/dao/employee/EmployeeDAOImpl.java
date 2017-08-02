/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01.dao.employee;

import com.avn.mvn01.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

/**
 *
 * @Author stephen.silver
 * @Document EmployeeDAOImpl
 * @Created on 31/07/2017, 12:21:33 PM
 *
 */
@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private DataSource dataSource;

    @Override
    public long save(final Employee employee) throws SQLException {
        final String SQL = "INSERT INTO EMPLOYEE (name, status) values (?, ?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        new JdbcTemplate(dataSource).update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps = connection.prepareStatement(SQL, new String[]{"id"});
                        ps.setString(1, employee.getName());
                        ps.setInt(2, employee.getStatus());
                        return ps;
                    }
                }, keyHolder);

        return keyHolder.getKey().longValue();
    }

    @Override
    public void update(Employee employee) throws SQLException {
        new JdbcTemplate().update("", new Object[]{employee.getName(), employee.getStatus()});
    }

    @Override
    public List<Employee> search(String key) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
