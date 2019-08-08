package org.nocoder.proxy;

/**
 * 代理对象
 */
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request(){
        System.out.println("proxy do something before subject request.");
        subject.request();
        System.out.println("proxy do something after subject request.");
    }
}

