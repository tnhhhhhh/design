package com.tnh.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 打印输出
 * @author: TNH
 * @create: 2019/11/11 14:59
 */
public class OutPutImpl {
    List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    //遍历所有的学院，然后调用下面的方法输出系
    public void printCollege(){
        //从 colleges里面取出所有学院，List已经实现了 Iterator接口可以直接获取
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()){
            College next = iterator.next();
            System.out.println("======"+next.getName()+"======");
            printDepartment(next.createIterator());
        }
    }

    //学院 输出 系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department next = (Department) iterator.next();
            System.out.println(next.getName());
        }
    }
}
