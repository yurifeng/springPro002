package com.yuri.spring.service;

import com.yuri.spring.dao.VehicleDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yurifeng
 * @create 2018-11-20 17:21
 * @PACKAGE_NAME com.yuri.spring.service
 * @PROJECT_NAME springPro002
 */

@Service(value = "vehicleService")
public class VehicleService {

//    /**
//     * 将VehicleDao成为VehicleService的属性
//     *
//     * @Autowired:自动将VehicleDao注入VehicleService中
//     */
//    @Autowired
//    private VehicleDao vehicleDao;

    /**
     * @Resource:name的属性值写注解创建dao对象的value值
     */
    @Resource(name = "vehicleDao")
    private VehicleDao vehicleDao;

    public void Catch() {
        System.out.println("This is the VehicleService.....");
        vehicleDao.Catch();
    }
}
