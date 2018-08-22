package org.nocoder.command.barbecue;

/**
 * 烤肉命令
 */
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.bakeMutton();
    }
}
