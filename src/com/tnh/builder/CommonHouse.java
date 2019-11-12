package com.tnh.builder;

/**
 * 实际的建造者，普通的房子
 * @author: TNH
 * @create: 2019/11/4 19:57
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基：10米");
        house.setBasic(10);
    }
    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙：10米");
        house.setWalls(10);
    }
}
