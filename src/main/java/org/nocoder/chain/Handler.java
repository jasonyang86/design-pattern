package org.nocoder.chain;

/**
 * 处理请求的接口
 */
public abstract class Handler {
    protected Handler successor;

    /**
     * 设置后继者
     * @param successor
     */
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    /**
     * 处理请求的抽象方法
     * @param request
     */
    public abstract void handleRequest(int request);
}

