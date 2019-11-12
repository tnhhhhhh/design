package com.tnh.visitor;

/**
 * @author: TNH
 * @create: 2019/11/8 18:55
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
