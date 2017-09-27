package org.nocoder.strategy;

/**
 * 上下文
 * Created by YANGJINLONG on 2017-9-27.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.doOperation(a, b);
    }
}
