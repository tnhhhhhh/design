package com.tnh.decorate;

/**
 * @author: TNH
 * @create: 2019/11/5 19:03
 */
public abstract class Drink {
    private String des; //描述
    private int price; //价格
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    //计算价钱
    public abstract int cost();
}
