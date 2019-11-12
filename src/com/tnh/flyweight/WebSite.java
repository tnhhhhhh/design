package com.tnh.flyweight;

/**
 * @author: TNH
 * @create: 2019/11/6 18:37
 */
public abstract class WebSite {
    //网站的发布形式
    protected String type;
    public WebSite(String type) { this.type = type; }
    //使用网站
    public abstract void use(User user);
}
