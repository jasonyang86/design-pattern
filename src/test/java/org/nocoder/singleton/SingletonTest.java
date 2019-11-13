package org.nocoder.singleton;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * singletonTest
 *
 * @author jason
 * @since 2019/11/13
 */
public class SingletonTest {
    private Singleton s1;
    private Singleton s2;

    @Before
    public void before(){
        s1 = Singleton.getInstance();
        s2 = Singleton.getInstance();
    }

    @Test
    public void classesAreTheSame(){
        assertEquals(s1, s2);
    }

    @Test
    public void messagesAreTheSame(){
        assertEquals(s1.showMessage(), s2.showMessage());
    }

}
