package org.nocoder.observer;

import org.junit.Before;
import org.junit.Test;

/**
 * ObserverTest
 *
 * @author jason
 * @since 2019/11/15
 */
public class ObserverTest {
    // 主题，消息发布者，被观察者
    private Subject subject;

    @Before
    public void before(){
        subject = new Subject();
    }

    @Test
    public void testBinaryObserver(){
        // 观察者，消息订阅者
        new BinaryObserver(subject);
        subject.setState(15);
    }
    @Test
    public void testHexaObserver(){
        // 观察者，消息订阅者
        new HexaObserver(subject);
        subject.setState(15);
    }
    @Test
    public void testOctalObserver(){
        // 观察者，消息订阅者
        new OctalObserver(subject);
        subject.setState(15);
    }
}
