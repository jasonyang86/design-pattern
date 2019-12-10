package org.nocoder.proxy;

public class RealSubject implements Subject {
    @Override
    public String request() {
        return "real subject request";
    }
}

