package com.tnh.template;

/**
 * @author: TNH
 * @create: 2019/11/7 10:26
 */
public class PutElephant extends Template {
    @Override
    protected void put() {
        System.out.println("放入大象");
    }

    @Override
    protected boolean isPut() {
        return false;
    }
}
