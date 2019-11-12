package com.tnh.builder;

/**
 * 实际的建造者，高楼
 * @author: TNH
 * @create: 2019/11/4 20:13
 */
public class HighHouse extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("给高楼打地基：100米");
        house.setBasic(100);
    }
    @Override
    public void buildWalls() {
        System.out.println("给高楼砌墙：100米");
        house.setWalls(100);
    }
}
