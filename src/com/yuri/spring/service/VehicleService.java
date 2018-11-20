package com.yuri.spring.service;

import com.yuri.spring.dao.VehicleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yurifeng
 * @create 2018-11-20 17:21
 * @PACKAGE_NAME com.yuri.spring.service
 * @PROJECT_NAME springPro002
 */

@Component(value = "vehicleService")
public class VehicleService {

    /**
     * 将VehicleDao成为VehicleService的属性
     *
     * @Autowired:自动将VehicleDao注入VehicleService中
     */
    @Autowired
    private VehicleDao vehicleDao;

    public void Catch() {
        System.out.println("This is the VehicleService.....");
        vehicleDao.Catch();
    }
}
