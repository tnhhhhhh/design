package com.tnh.bridge;

/**
 * @author: TNH
 * @create: 2019/11/5 15:21
 */
public class FoldPhone extends Phone{
    public FoldPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void call() {
        System.out.println("折叠手机");
        this.call();
    }
}
