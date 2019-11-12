package com.tnh.command;

/**
 * @author: TNH
 * @create: 2019/11/7 15:27
 */
public interface Command {
    void execute(); //执行操作
    void undo(); //撤销操作
}
