package com.tnh.adapter;

import com.tnh.adapter.inter.AbstractAdapter;
import com.tnh.adapter.inter.InterfaceAdapter;
import com.tnh.factory.simple.AbstractFactory;

/**
 * @author: TNH
 * @create: 2019/11/5 9:43
 */
public class Phone {
    //充电方法，需要传入适配器
    public void recharge(InterfaceAdapter abstractAdapter){
        abstractAdapter.m1();
    }
}
