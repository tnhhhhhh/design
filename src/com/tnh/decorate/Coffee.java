package com.tnh.decorate;

/**
 * @author: TNH
 * @create: 2019/11/5 19:24
 */
public class Coffee extends Drink {
    @Override
    public int cost() {
        return super.getPrice();
    }
    @Override
    public String getDes() {
        return super.getDes()+"="+super.getPrice();
    }
}
