package com.tnh.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: TNH
 * @create: 2019/11/6 9:56
 */
public class University extends OrganizationComponent {
    //聚合入组织类，其实是聚合下级节点
    private List<OrganizationComponent> organizationComponents=new ArrayList<>();
    public University(String name) { super(name); }

    @Override
    public void add(OrganizationComponent component) {
        organizationComponents.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        organizationComponents.remove(component);
    }

    @Override
    public void print() {
        //利用递归输出当前节点下的所有节点
        System.out.println("======="+getName()+"=======");
        for (OrganizationComponent component : organizationComponents) {
            component.print();
        }
    }
}
