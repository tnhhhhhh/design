package com.tnh.adapter;

/**
 * 适配器类，实现适配器接口，继承被适配器类
 * @author: TNH
 * @create: 2019/11/5 9:35
 */
public class VoltageAdapter implements IVoltage5V {
    //聚合入被适配器类
    private Voltage220V voltage220V;
    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        System.out.println("降压为5V");
        return voltage220V.output220V()/44;
    }
}
