package com.tnh.command;

/**
 * @author: TNH
 * @create: 2019/11/7 15:35
 */
public class LightOffCommand implements Command {
    private LightReceiver lightReceiver;
    public LightOffCommand(LightReceiver lightReceiver){
        this.lightReceiver=lightReceiver;
    }
    @Override
    public void execute() {
        //关灯
        lightReceiver.off();
    }
    @Override
    public void undo() {
        //撤销
        lightReceiver.on();
    }
}
