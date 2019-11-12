package com.tnh.iterator;

import java.util.Iterator;

/**
 * 计算机学院
 *
 * @author: TNH
 * @create: 2019/11/11 10:51
 */
public class ComputerCollegeIterator implements Iterator {
    //这里需要知道Department是以什么方式存放的
    private Department[] department;
    //游标
    private int index = 0;

    public ComputerCollegeIterator(Department[] department) {
        this.department = department;
    }

    @Override
    public boolean hasNext() {
        //如果游标位置大于或等于数组长度或者游标位置的值为空则返回没有
        if (index >= department.length || department[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return department[index++];
    }
}
