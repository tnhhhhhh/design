package com.tnh.composite;

/**
 * 组织
 * @author: TNH
 * @create: 2019/11/6 9:45
 */
public abstract class OrganizationComponent {
    private String name; //名字

    public void add(OrganizationComponent component){
        //默认实现，因为叶子不需要从写，直接调用就抛出异常
        throw new UnsupportedOperationException();
    }
    public void remove(OrganizationComponent component){
        //默认实现，因为叶子不需要从写，直接调用就抛出异常
        throw new UnsupportedOperationException();
    }
    //打印信息
    public abstract void print();

    public OrganizationComponent(String name) { this.name = name; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
