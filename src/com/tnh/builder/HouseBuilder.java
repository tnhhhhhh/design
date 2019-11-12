package com.tnh.builder;

/**
 * 抽象的建造者
 * @author: TNH
 * @create: 2019/11/4 19:49
 */
public abstract class HouseBuilder {
    //组合入House商品类
    protected House house=new House();
    //将建造者流程写好抽象方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    //建造好并返回House商品类
    public House buildHouse(){
        return house;
    }
}
