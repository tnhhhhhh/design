package com.tnh.visitor;

/**
 * @author: TNH
 * @create: 2019/11/8 18:55
 */
public abstract class Person {
    public abstract void accept(Action action);
}