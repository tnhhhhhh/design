package com.tnh.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象局
 * @author: TNH
 * @create: 2019/11/11 19:07
 */
public class WeatherData implements Subject{
    //气温
    private int temperature;
    //观察者集合
    private List<Observer> observerList=new ArrayList<>();

    //设置新气温，并通知所有观察者
    public void setData(int temperature){
        this.temperature=temperature;
        notifyObserver();
    }
    @Override
    public void registerObserver(Observer observer) {
        //注册观察者
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        //移除观察者
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observerTemp : observerList) {
            //通知所有观察者最新的天气情况
            observerTemp.update(temperature);
        }
    }
}
