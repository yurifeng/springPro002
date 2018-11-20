package com.yuri.spring.dao;

import org.springframework.stereotype.Component;

/**
 * @author yurifeng
 * @create 2018-11-20 17:23
 * @PACKAGE_NAME com.yuri.spring.dao
 * @PROJECT_NAME springPro002
 */

@Component(value = "vehicleDao")
public class VehicleDao {

    public void Catch() {
        System.out.println("This is the VehicleDao.... ");
    }

}
