package org.nocoder.command;

/**
 * 要求命令执行处理请求
 */
public class Invoker {
    private Command cmd;

    public void setCommand(Command cmd){
        this.cmd = cmd;
    }

    public void executeCommand(){
        System.out.println("要求命令执行处理请求.");
        cmd.execute();
    }
}


