/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avn.mvn01;

/**
 *
 * @Author stephen.silver
 * @Document Hello
 * @Created on 31/07/2017, 11:48:37 AM
 *
 */
public class Hello {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        System.out.println("Hello ! " + name);
    }
}
