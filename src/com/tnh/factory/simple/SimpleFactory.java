package com.tnh.factory.simple;

import com.tnh.factory.domain.Apple;
import com.tnh.factory.domain.Banana;
import com.tnh.factory.domain.Fruit;

/**
 *
 * Author tnh
 * create 2019/11/4 9:53
 */
//私有化构造区并且不对外提供对象
public class SimpleFactory{
    //私有化构造区
    private SimpleFactory(){}
    //获取水果的工厂方法
    public static Fruit fruitFactory(String name){
        Fruit fruit=null;
        switch (name){
            case "apple":fruit=new Apple("苹果");break;
            case "banana":fruit=new Banana("香蕉");break;
        }
        return fruit;
    }
}
