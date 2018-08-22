package org.nocoder.command.barbecue;

public class Demo {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
        Command bakeChickenCommand = new BakeChickenCommand(barbecuer);

        Waiter waiter = new Waiter();
        waiter.setOrder(bakeMuttonCommand);
        waiter.setOrder(bakeChickenCommand);
        waiter.notifyBarbecuer();
    }
}
