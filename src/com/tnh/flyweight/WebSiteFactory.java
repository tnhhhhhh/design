package com.tnh.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: TNH
 * @create: 2019/11/6 18:40
 */
public class WebSiteFactory {
    //对象池
    private Map<String,ConcreteWebSite> pool=new HashMap<>();
    //根据网站类型从对象池获取网站
    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)){
            //如果对象池里面没有就创建一个并放如对象池
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }
    //获取网站发布形式的数量，对象池中的对象数量
    public int getWebSiteSize(){
        return pool.size();
    }
}
