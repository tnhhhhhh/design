package com.tnh.decorate;

/**
 * @author: TNH
 * @create: 2019/11/5 19:41
 */
public class Sugar extends Decorate {
    public Sugar(Drink drink) {
        super(drink);
        setDes("糖");
        setPrice(2);
    }
}
