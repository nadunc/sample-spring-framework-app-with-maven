/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01.controller;

import com.avn.mvn01.model.Employee;
import com.avn.mvn01.service.employee.EmployeeService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @Author stephen.silver
 * @Document EmployeeController
 * @Created on 31/07/2017, 11:58:35 AM
 *
 */

public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    public String addEmployee(Employee employee) {
        try {
            employeeService.save(employee);
            System.out.println(employee.getId());
            return "Employee Saved.";
        } catch (Exception e) {
            return "Employee Save Failed.";
        }
    }
    
    public Employee findById(long employeeId){
        try {
            return employeeService.findById(employeeId);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public String update(Employee employee){
        try {
            employeeService.update(employee);
            return "Employee updated";
        } catch (Exception e) {
            return "Employee update failed";
        }
    }
    
    public List<Employee> search(String keyword){
        List<Employee> employees =  new ArrayList<>();
        try{
            employees = employeeService.search(keyword);
        }catch(Exception e){
            System.out.println("Employee search failed");
            System.out.println(e.getMessage());
        }
        return employees;
    }
}
