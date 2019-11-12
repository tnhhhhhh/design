package com.tnh.composite;

/**
 * @author: TNH
 * @create: 2019/11/6 10:29
 */
public class Department extends OrganizationComponent {
    public Department(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
