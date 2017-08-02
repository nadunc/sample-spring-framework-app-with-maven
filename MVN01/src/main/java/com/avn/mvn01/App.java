/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01;

import com.avn.mvn01.controller.EmployeeController;
import com.avn.mvn01.model.Employee;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @Author stephen.silver
 * @Document Main
 * @Created on 31/07/2017, 11:10:46 AM
 *
 */
public class App {

    private static ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean showMenu = true;
        do {
            System.out.println("------ Menu ------");

            System.out.println("1. Insert employee");
            System.out.println("2. Update employee");
            System.out.println("3. Search employee");
            System.out.println("99. Exit");

            System.out.print("Enter selection : ");
            String selection = sc.next();
            switch (selection) {
                case "1":
                    insertEmplpoyee();
                    break;
                case "2":
                    updateEmployee();
                    break;
                case "3":
                    searchEmployee();
                    break;
                case "99":
                    System.out.println("------ Thank you ------");
                    showMenu = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
            System.out.println();
        } while (showMenu);
    }

    private static void insertEmplpoyee() {
        System.out.println("Insert");

        EmployeeController employeeController = (EmployeeController) context.getBean("employeeController");
//
        Employee emp = new Employee();
        emp.setName("Nadun");
        emp.setStatus(1);
        System.out.println(employeeController.addEmployee(emp));
    }

    private static void updateEmployee() {
        System.out.println("Update");
    }

    private static void searchEmployee() {
        System.out.println("Search");
    }
}
