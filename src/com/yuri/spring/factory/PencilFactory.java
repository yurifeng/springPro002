package com.yuri.spring.factory;


import com.yuri.spring.bean.Pencil;

/**
 * @author yurifeng
 * @create 2018-11-19 17:08
 * @PACKAGE_NAME com.yuri.spring.factory
 * @PROJECT_NAME springPro002
 */
public class PencilFactory {

    public static Pencil getPencil() {
        return new Pencil();
    }

}
