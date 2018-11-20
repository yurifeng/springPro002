package com.yuri.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author yurifeng
 * @create 2018-11-20 16:37
 * @PACKAGE_NAME com.yuri.spring.annotation
 * @PROJECT_NAME springPro002
 */

/**
 * 类上添加注解,以下注解功能相同:
 *
 * @Component
 * @Controller(web层)
 * @Service(service层)
 * @Repository(dao层)
 */
@Component(value = "vehicle")
@Scope(value = "prototype")
public class Vehicle {

    public void startEngine() {
        System.out.println("Vehicle's engine has been started....");
    }
}
