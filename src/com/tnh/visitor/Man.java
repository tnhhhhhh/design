package com.tnh.visitor;

/**
 * 这里采用了双分派
 * 第一次分派：在客户端将具体状态传入Man对象中
 * 第二次分派：然后调用具体状态的对应方法在将自己穿进去
 * @author: TNH
 * @create: 2019/11/8 18:55
 */
public class Man extends Person {
    @Override
    public void accept(Action action) {
        //双分派
        //访问 被访问者 的对应方法并将自己(访问者)传进去
        action.getManResult(this);
    }
}
