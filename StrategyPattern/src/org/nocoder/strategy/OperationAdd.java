package org.nocoder.strategy;

/**
 * 加法
 * Created by YANGJINLONG on 2017-9-27.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}