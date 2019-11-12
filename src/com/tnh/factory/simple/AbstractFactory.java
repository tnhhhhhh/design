package com.tnh.factory.simple;

import com.tnh.factory.domain.Apple;
import com.tnh.factory.domain.Banana;
import com.tnh.factory.domain.Fruit;

/**
 * @author: TNH
 * @create: 2019/11/4 14:54
 */
public interface AbstractFactory {
    Fruit createApple();
    Fruit createBanana();
}

class ChineseFruitFactory implements AbstractFactory{
    @Override
    public Fruit createApple() {
        return new Apple("中国苹果");
    }
    @Override
    public Fruit createBanana() {
        return new Banana("中国香蕉");
    }
}

class ForeignFruitFactory implements AbstractFactory{
    @Override
    public Fruit createApple() {
        return new Apple("外国苹果");
    }
    @Override
    public Fruit createBanana() {
        return new Banana("外国香蕉");
    }
}