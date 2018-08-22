package org.nocoder.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者（发布者）
 */
public class Subject {

    // 观察者
    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 状态变更通知已订阅的观察者
        notifyAllObservers();
    }

    /**
     * 添加订阅
     * @param observer
     */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * 通知已订阅的观察者
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
