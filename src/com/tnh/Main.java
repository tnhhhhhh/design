package com.tnh;




import com.tnh.iterator.College;
import com.tnh.iterator.ComputerCollege;
import com.tnh.iterator.InfoCollege;
import com.tnh.iterator.OutPutImpl;
import com.tnh.observer.CurrentConditions;
import com.tnh.observer.WeatherData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tnh
 * @create:  2019/11/3 17:10
 */
public class Main {
    public static void main(String[] args) {
        //创建被观察者
        WeatherData weatherData = new WeatherData();
        //添加入观察者
        weatherData.registerObserver(new CurrentConditions());
        //设置天气并通知被观察者
        weatherData.setData(30);

    }
}
