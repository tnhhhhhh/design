package com.tnh.iterator;

import java.util.Iterator;

/**
 * @author: TNH
 * @create: 2019/11/11 11:05
 */
public interface College {
    public String getName();
    //添加系
    public void addDepartment(String name,String des);
    //返回迭代器
    public Iterator createIterator();
}
