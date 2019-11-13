package org.nocoder.chain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * ChainTest
 *
 * @author jason
 * @since 2019/11/13
 */
public class ChainTest {
    Handler handler1;
    Handler handler2;

    @Before
    public void before(){
        handler1 = new ConcreteHandlerA();
        handler2 = new ConcreteHandlerB();
        handler1.setSuccessor(handler2);
    }

    @Test
    public void whenLessThan10ThenHandlerA(){
        assertEquals("ConcreteHandlerA", handler1.handleRequest(9));
    }

    @Test
    public void whenGreaterThan10ThenHandlerB(){
        assertEquals("ConcreteHandlerB", handler1.handleRequest(11));
    }
}
