package org.nocoder.observer;

public class Demo {
    public static void main(String[] args) {
        // 被观察者，发布消息者
        Subject subject = new Subject();

        // 观察者，订阅者消费消息
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        // 触发事件通知已经订阅的观察者
        subject.setState(15);

        // 触发事件通知已经订阅的观察者
        subject.setState(100);

        // 观察者消费订阅，执行 update() 方法
    }
}