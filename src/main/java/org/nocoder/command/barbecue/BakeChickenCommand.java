package org.nocoder.command.barbecue;

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
}
