package com.tnh.command;

/**
 * 没有任何命令的空实现，用于初始化每个按钮。当调用空命令时候，对象什么都不做
 * 其实是设计模式，可以省掉空判断
 * @author: TNH
 * @create: 2019/11/7 16:19
 */
public class NoCommand implements Command {
    @Override
    public void execute() { }
    @Override
    public void undo() { }
}
