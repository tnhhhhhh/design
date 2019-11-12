package com.tnh.bridge;

/**
 * @author: TNH
 * @create: 2019/11/5 15:15
 */
public abstract class Phone {
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }

    //聚合入品牌
    private Brand brand;
    public Phone(Brand brand) {
        this.brand = brand;
    }
    public abstract void call();
}

