package com.tnh.template;

/**
 * @author: TNH
 * @create: 2019/11/7 10:24
 */
public abstract class Template {
    //用于判断是否需要放入东西，如果不需要，则之类重写即可
    protected boolean isPut(){
        return true;
    }
    //使用模板
    public void execute(){
        open();
        //调用 isPut方法，判断是否需要放入东西
        if (isPut()) { put(); }
        close();
    }
    //开门模板
    protected void open(){
        System.out.println("打开冰箱门");
    }
    //放入什么，交给子类决定
    protected abstract void put();
    //关门模板
    protected void close(){
        System.out.println("关闭冰箱门");
    }
}
