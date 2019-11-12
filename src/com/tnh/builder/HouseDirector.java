package com.tnh.builder;

/**
 * 指挥者，指定制作流程
 * @author: TNH
 * @create: 2019/11/4 20:02
 */
public class HouseDirector {
    //聚合建造者
    private HouseBuilder houseBuilder;
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    //指挥建造房子，并返回建造好的房子
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        return houseBuilder.buildHouse();
    }
}
