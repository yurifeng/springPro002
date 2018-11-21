package com.yuri.spring.annotation_xml;

import javax.annotation.Resource;

/**
 * @author yurifeng
 * @create 2018-11-21 12:07
 * @PACKAGE_NAME com.yuri.spring.annotation_xml
 * @PROJECT_NAME springPro002
 */
public class BookService {

    @Resource(name = "bookDao")
    private BookDao bookDao;

    @Resource(name = "orderDao")
    private OrderDao orderDao;

    public void BuyBook() {
        System.out.println("Buying a book.....");
        bookDao.showBook();
        orderDao.BuyOperation();
    }


}
