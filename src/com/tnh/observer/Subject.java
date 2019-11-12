package com.tnh.observer;

/**
 * 被观察者接口
 * @author: TNH
 * @create: 2019/11/11 18:54
 */
public interface Subject {
    //注册观察者
    void registerObserver(Observer observer);
    //移除观察者
    void removeObserver(Observer observer);
    //通知观察者
    void notifyObserver();
}