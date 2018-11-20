package com.yuri.spring.bean;

/**
 * @author yurifeng
 * @create 2018-11-19 11:29
 * @PACKAGE_NAME com.yuri.spring.bean
 * @PROJECT_NAME springPro002
 */
public class Elementary {

    private String name;

    public Elementary() {
    }

    public Elementary(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello" + "," + name);
    }
}
