package com.yuri.spring.property;

/**
 * @author yurifeng
 * @create 2018-11-20 14:36
 * @PACKAGE_NAME com.yuri.spring.property
 * @PROJECT_NAME springPro002
 */
public class KeyBoard {

    private String keyname;

    public void setKeyname(String keyname) {
        this.keyname = keyname;
    }

    public void pressKeyBoard() {
        System.out.println("KeyBoard " + keyname + " has pressed...");
    }
}
