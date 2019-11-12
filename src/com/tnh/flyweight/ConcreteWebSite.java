package com.tnh.flyweight;

/**
 * @author: TNH
 * @create: 2019/11/6 18:39
 */
public class ConcreteWebSite extends WebSite {
    public ConcreteWebSite(String type) {
        super(type);
    }
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+"，使用者为："+user.getName());
    }
}
