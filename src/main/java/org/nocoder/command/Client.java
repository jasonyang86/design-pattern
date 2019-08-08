package org.nocoder.command;

/**
 * 创建一个具体命令对象并设定它的接收者
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(cmd);
        invoker.executeCommand();
    }
}


