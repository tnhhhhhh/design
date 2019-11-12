package com.tnh.decorate;

/**
 * 装饰器，调料
 * @author: TNH
 * @create: 2019/11/5 19:31
 */
public class Decorate extends Drink {
    //聚合入被装饰类
    private Drink drink;
    public Decorate(Drink drink){
        this.drink=drink;
    }
    @Override
    public int cost() {
        //价格：自己的价格 + 传入的价格
        return super.getPrice()+drink.getPrice();
    }
    @Override
    public String getDes() {
        //重写详情，递归的方式输出所有被装饰类和装饰类
        return super.getDes()+"="+super.getPrice()+" && "+drink.getDes();
    }
}
