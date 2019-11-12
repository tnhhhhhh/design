package com.tnh.factory.simple;

import com.tnh.factory.domain.Apple;
import com.tnh.factory.domain.Banana;
import com.tnh.factory.domain.Fruit;

/**
 * @author: TNH
 * @create: 2019/11/4 14:43
 */
public interface FactoryMethod {
    Fruit create();
}
class AppleFactory implements FactoryMethod{
    @Override
    public Fruit create() {
        return new Apple("苹果");
    }
}
class BananaFactory implements FactoryMethod{
    @Override
    public Fruit create() {
        return new Banana("香蕉");
    }
}
