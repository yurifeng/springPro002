package com.yuri.spring.IoC;


import com.yuri.spring.dao.ElemenatryDao;

/**
 * @author yurifeng
 * @create 2018-11-20 14:51
 * @PACKAGE_NAME com.yuri.spring.IoC
 * @PROJECT_NAME springPro002
 */
public class ElementaryService {

    /**
     * 让ElemenatryDao成为ElementaryService的属性
     */
    private ElemenatryDao elemenatryDao;

    /**
     * 设置set
     * @param elemenatryDao
     */
    public void setElemenatryDao(ElemenatryDao elemenatryDao) {
        this.elemenatryDao = elemenatryDao;
    }

    public void add() {
        System.out.println("ElementaryService method...");
        elemenatryDao.add();
    }

}
