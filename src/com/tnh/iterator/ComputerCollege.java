package com.tnh.iterator;

import java.util.Iterator;

/**
 * @author: TNH
 * @create: 2019/11/11 11:08
 */
public class ComputerCollege implements College {
    private Department[] departments;
    int index=0;

    public ComputerCollege() {
        departments=new Department[5];
        addDepartment("专业a","专业a");
        addDepartment("专业b","专业b");
        addDepartment("专业c","专业c");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        departments[index++]=new Department(name,des);
    }

    @Override
    public Iterator createIterator() {
        //返回对应迭代器，传入当前对象内的数组
        return new ComputerCollegeIterator(departments);
    }
}
