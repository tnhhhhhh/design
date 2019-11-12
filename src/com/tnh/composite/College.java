package com.tnh.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: TNH
 * @create: 2019/11/6 10:12
 */
public class College extends OrganizationComponent {
    private List<OrganizationComponent> organizationComponents=new ArrayList<>();
    public College(String name) {
        super(name);
    }

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
        System.out.println("======="+getName()+"=======");
        for (OrganizationComponent component : organizationComponents) {
            component.print();
        }
    }
}
