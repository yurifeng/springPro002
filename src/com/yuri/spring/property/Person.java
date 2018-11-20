package com.yuri.spring.property;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author yurifeng
 * @create 2018-11-20 15:42
 * @PACKAGE_NAME com.yuri.spring.property
 * @PROJECT_NAME springPro002
 */
public class Person {

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    private String[] arrs;
    private List<String> list;
    private Map<String, String> map;
    private Properties properties;


    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void personPrint() {
        System.out.println("arrs: " + arrs);
        System.out.println("list: " + list);
        System.out.println("map: " + map);
        System.out.println("properties: " + properties);
    }
}
