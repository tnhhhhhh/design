package com.tnh.visitor;

/**
 * @author: TNH
 * @create: 2019/11/8 18:52
 */
public abstract class Action {
    //得到男评委的测评结果
    public abstract void getManResult(Man man);
    //得到女评委的测评结果
    public abstract void getWomanResult(Woman woman);
}
