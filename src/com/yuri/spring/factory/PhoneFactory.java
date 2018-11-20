package com.yuri.spring.factory;

import com.yuri.spring.bean.Phone;

/**
 * @author yurifeng
 * @create 2018-11-20 12:55
 * @PACKAGE_NAME com.yuri.spring.factory
 * @PROJECT_NAME springPro002
 */
public class PhoneFactory {

    public Phone getPhone() {
        return new Phone();
    }
}
