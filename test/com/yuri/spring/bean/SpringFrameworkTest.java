package com.yuri.spring.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yurifeng
 * @create 2018-11-19 16:32
 * @PACKAGE_NAME test.com.yuri.spring.bean
 * @PROJECT_NAME springPro002
 */
public class SpringFrameworkTest {


    /**
     * 测试代码
     */
    @Test
    public void test() {

        /**
         * 1.加载spring配置文件,创建对象
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");

        /**
         * 2.得到配置创建的对象
         */
        Elementary elementary = (Elementary) context.getBean("elementary");

        System.out.println(elementary);
        elementary.hello();
    }

    /**
     * 静态工厂创建Bean实例化
     */
    @Test
    public void test2() {
        /**
         * 1.加载spring配置文件,创建对象
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config.xml");
        Object pencil = context.getBean("pencil");
        System.out.println(pencil);
    }


}