package com.tnh.command;

/**
 * @author: TNH
 * @create: 2019/11/7 15:31
 */
public class LightOnCommand implements Command {
    private LightReceiver lightReceiver;
    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
    @Override
    public void execute() {
        //开灯
        lightReceiver.on();
    }
    @Override
    public void undo() {
        //撤销
        lightReceiver.off();
    }
}
