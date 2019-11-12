package com.tnh.command;

/**
 * @author: TNH
 * @create: 2019/11/7 18:41
 */
public class RemoteController {
    //开、关按钮的命令数组
    private Command[] onCommands;
    private Command[] offCommands;
    //执行撤销的命令，存储上次的命令
    private Command undoCommand;
    //构造器初始化数组
    public RemoteController(){
        onCommands=new Command[5];
        offCommands=new Command[5];
        for(int i=0;i<5;i++){
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }
    //给按钮设置对应的命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no]=onCommand;
        offCommands[no]=offCommand;
    }
    //按下开的按钮
    public void onButtonWasPushed(int no){
        //执行对应的方法
        onCommands[no].execute();
        //记录这次操作，用于撤销操作
        undoCommand=onCommands[no];
    }
    //按下关的按钮
    public void offButtonWasPushed(int no){
        //执行对应的方法
        offCommands[no].execute();
        //记录这次操作，用于撤销操作
        undoCommand=onCommands[no];
    }
    //按下撤销按钮
    private void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
