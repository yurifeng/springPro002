package com.yuri.spring.property;

/**
 * @author yurifeng
 * @create 2018-11-20 14:24
 * @PACKAGE_NAME com.yuri.spring.property
 * @PROJECT_NAME springPro002
 */
public class School {

    private String schoolName;

    public School() {
    }

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void ShowSchool() {
        System.out.println("This is a school,name is " + schoolName);
    }
}
