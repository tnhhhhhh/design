package com.tnh.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理了很多的人
 * @author: TNH
 * @create: 2019/11/8 19:09
 */
public class ObjectStructure {
    private List<Person> persons=new LinkedList<>();

    public void add(Person person){
        persons.add(person);
    }
    public void remove(Person person){
        persons.remove(person);
    }
    //显示详情
    public void display(Action action){
        for (Person person : persons) {
            //访问者传入被访问者对象
            //并通过被访问者对象的对应方法将自己传进去(访问)
            person.accept(action);
        }
    }
}
