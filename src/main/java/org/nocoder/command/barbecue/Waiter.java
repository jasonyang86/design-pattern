package org.nocoder.command.barbecue;

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
        for (Command command : commandList) {
            command.execute();
        }
    }
}