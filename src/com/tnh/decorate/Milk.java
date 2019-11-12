package com.tnh.decorate;

/**
 * @author: TNH
 * @create: 2019/11/5 19:39
 */
public class Milk extends Decorate {
    public Milk(Drink drink) {
        super(drink);
        setDes("牛奶");
        setPrice(3);
    }
}
