package org.nocoder.chain;

/**
 * 接收10以内的参数并处理
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public String handleRequest(int request) {
        // 执行具体处理类A的逻辑
        if(request >= 0 && request < 10){
            return this.getClass().getSimpleName();
        }

        // 如果有后继者，则继续调用后继者的处理方法
        if(successor != null){
            return successor.handleRequest(request);
        }
        return null;
    }
}
