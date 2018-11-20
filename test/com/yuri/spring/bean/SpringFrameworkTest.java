package com.yuri.spring.bean;

import com.yuri.spring.IoC.ElementaryService;
import com.yuri.spring.property.KeyBoard;
import com.yuri.spring.property.Person;
import com.yuri.spring.property.School;
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
     * 构造方法创建Bean实例化
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
        Elementary elementary1 = (Elementary) context.getBean("elementary");//测试单例,多例(singleton,prototype)

        System.out.println(elementary);
        System.out.println(elementary1);
        elementary.methodFunc();
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
        Pencil pencil = (Pencil) context.getBean("pencil");
        System.out.println(pencil);
    }


    /**
     * 普通类创建Bean实例化
     */
    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-config.xml");
        Phone phone = (Phone) applicationContext.getBean("phone");
        System.out.println(phone);

    }


    /**
     * 构造创建Bean实例化对象
     */
    @Test
    public void test4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-config.xml");
        School school = (School) applicationContext.getBean("school");
        school.ShowSchool();
    }


    /**
     * set创建Bean实例化对象
     */
    @Test
    public void test5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-config.xml");
        KeyBoard keyboard = (KeyBoard) applicationContext.getBean("keyboard");
        keyboard.pressKeyBoard();

    }


    /**
     * service中引入dao的注入对象测试
     */
    @Test
    public void test6() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-config.xml");
        ElementaryService elementaryService = (ElementaryService) applicationContext.getBean("elementaryService");
        elementaryService.add();
    }


    /**
     * 测试复杂的注入
     */
    @Test
    public void test7() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring-config.xml");
        Person person = (Person) applicationContext.getBean("person");
        person.personPrint();
    }


}