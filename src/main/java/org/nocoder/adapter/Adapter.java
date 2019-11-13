package org.nocoder.adapter;

/**
 * 适配器,包含转换后的接口
 */
public class Adapter extends Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public String request() {
        return adaptee.specificRequest();
    }
}


