package com.tnh.flyweight;

/**
 * @author: TNH
 * @create: 2019/11/6 18:46
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
