package com.yuri.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author yurifeng
 * @create 2018-11-21 14:15
 * @PACKAGE_NAME com.yuri.spring.aop
 * @PROJECT_NAME springPro002
 */
public class HRManagementAdvice {

    /**
     * 前置通知方法
     */
    public void beforeAdvice() {
        System.out.println("前置增强......");
    }

    /**
     * 后置通知方法
     */
    public void afterAdvice() {
        System.out.println("后置增强.......");
    }

    /**
     * 环绕通知方法
     */
    public void roundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        //普通方法之前
        System.out.println("普通方法之前...");

        //执行被增强的方法
        proceedingJoinPoint.proceed();

        //普通方法之后
        System.out.println("普通方法之后....");

    }


}
