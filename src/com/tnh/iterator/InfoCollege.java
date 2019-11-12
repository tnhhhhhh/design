package com.tnh.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 信息学院
 * @author: TNH
 * @create: 2019/11/11 14:49
 */
public class InfoCollege implements College{
    private List<Department> departments;

    public InfoCollege() {
        departments = new ArrayList<>();
        addDepartment("专业A","专业A");
        addDepartment("专业B","专业B");
        addDepartment("专业C","专业C");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String des) {
        departments.add(new Department(name,des));
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
