package org.nocoder.observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getName() + ": " + Integer.toHexString(subject.getState()));
    }
}
