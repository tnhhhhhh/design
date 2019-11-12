package com.tnh.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 信息工程系
 * @author: TNH
 * @create: 2019/11/11 10:58
 */
public class InfoCollegeIterator implements Iterator {
    private List<Department> department;
    private int index=0;

    public InfoCollegeIterator(List<Department> department) {
        this.department = department;
    }

    @Override
    public boolean hasNext() {
        if(index>=department.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return department.get(index++);
    }
}
