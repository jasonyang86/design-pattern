package org.nocoder.command.demo;

/**
 * 烤鸡命令
 */
public class BakeChickenCommand extends Command{

    public BakeChickenCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.bakeChicken();
    }

    @Override
    public String toString() {
        return "烤鸡翅";
    }
}
