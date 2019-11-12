package com.tnh.bridge;

/**
 * @author: TNH
 * @create: 2019/11/5 15:21
 */
public class CommonPhone extends Phone{
    public CommonPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void call() {
        System.out.println("普通手机");
        getBrand().call();
    }
}
