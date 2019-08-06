package org.nocoder.observer;

public class Client {
    public static void main(String[] args) {
        // 主题，被观察者，发布消息者
        Subject subject = new Subject();

        // 观察者，订阅者消费消息
        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        // 触发事件通知已经订阅的观察者，观察者消费订阅，执行 update() 方法
        subject.setState(15);

        // 触发事件通知已经订阅的观察者，观察者消费订阅，执行 update() 方法
        subject.setState(100);
    }
}