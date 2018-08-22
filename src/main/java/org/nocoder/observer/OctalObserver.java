package org.nocoder.observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getName() + ": " + Integer.toOctalString(subject.getState()));
    }
}
