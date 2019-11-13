package org.nocoder.chain;

/**
 * 接收10～20的整数并处理
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public String handleRequest(int request) {
        // 执行具体处理类B的逻辑
        if(request >= 10 && request < 20){
            return this.getClass().getSimpleName();
        }

        // 如果有后继者，则继续调用后继者的处理方法
        if(successor != null){
            return successor.handleRequest(request);
        }
        return null;
    }
}

