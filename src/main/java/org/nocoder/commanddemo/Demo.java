package org.nocoder.commanddemo;

public class Demo {

    public static void main(String[] args) {

        Barbecuer barbecuer = new Barbecuer();
        System.out.println("烧烤师傅就位");

        Command bakeMuttonCommand = new BakeMuttonCommand(barbecuer);
        System.out.println("顾客点餐:" + bakeMuttonCommand.toString());
        Command bakeChickenCommand = new BakeChickenCommand(barbecuer);
        System.out.println("顾客点餐:" + bakeChickenCommand.toString());


        Waiter waiter = new Waiter();
        waiter.setOrder(bakeMuttonCommand);
        System.out.println("服务员记录订单：" + bakeMuttonCommand.toString());
        waiter.setOrder(bakeChickenCommand);
        System.out.println("服务员记录订单：" + bakeChickenCommand.toString());
        waiter.notifyBarbecuer();
    }
}
