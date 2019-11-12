package com.tnh.observer;

/**
 * 当前天气
 * @author: TNH
 * @create: 2019/11/11 19:02
 */
public class CurrentConditions implements Observer{
    private int temperature;
    @Override
    public void update(int temperature){
        this.temperature=temperature;
        display();
    }
    public void display(){
        System.out.println("当前气温："+temperature);
    }
}
