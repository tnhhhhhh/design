package com.tnh.visitor;

/**
 * @author: TNH
 * @create: 2019/11/8 18:59
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男评委给该歌手的评价是成功");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女评委给该歌手的评价是成功");
    }
}
