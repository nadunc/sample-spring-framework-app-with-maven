/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.avn.mvn01;

import com.avn.mvn01.controller.EmployeeController;
import com.avn.mvn01.model.Employee;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @Author stephen.silver
 * @Document Main
 * @Created on 31/07/2017, 11:10:46 AM

 */
public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        
        EmployeeController employeeController = (EmployeeController) context.getBean("EmployeeController");

        Employee emp = new Employee();
        emp.setName("Nadun");
        emp.setStatus(1);
        System.out.println(employeeController.addEmployee(emp));
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
    }
}
