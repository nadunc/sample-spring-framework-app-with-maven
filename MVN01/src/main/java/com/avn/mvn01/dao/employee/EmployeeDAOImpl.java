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
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @Author stephen.silver
 * @Document EmployeeDAOImpl
 * @Created on 31/07/2017, 12:21:33 PM
 *
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public Employee save(Employee employee) throws SQLException {
        return employee;
    }

    @Override
    public Employee update(Employee employee) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> search(String key) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(Employee employee) {
        String SQL = "insert into Student (name, age) values (?, ?)";
//      jdbcTemplateObject.update( SQL, name, age);
//      System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }
}
