package org.nocoder.command.barbecue;

/**
 * 命令抽象类
 */
public abstract class Command {

    protected Barbecuer receiver;

    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }

    public abstract void execute();
}
