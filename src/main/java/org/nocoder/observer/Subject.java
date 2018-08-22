package org.nocoder.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 订阅
     * @param observer
     */
    public void attch(Observer observer){
        observers.add(observer);
    }

    /**
     * 通知订阅的观察者
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
