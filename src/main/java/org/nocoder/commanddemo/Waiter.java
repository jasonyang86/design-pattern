package org.nocoder.commanddemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员
 */
public class Waiter {

    private List<Command> commandList = new ArrayList<>();

    /**
     * 记录订单
     */
    public void setOrder(Command command){
        commandList.add(command);
    }

    /**
     * 通知烧烤师傅
     */
    public void notifyBarbecuer(){
        System.out.println("服务员通知烧烤师傅");
        for (Command command : commandList) {
            command.execute();
        }
    }
}
