package org.nocoder.adapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * <p>Copyright (c)2019-CDP Travelsky</p>
 * <p>Project grpv2</p>
 * <p>Module ID</p>
 * <p>Comments </p>
 * <p>JDK version used JDK1.8</p>
 *
 * @author jason
 * @version 2.0.0
 * @since 2019/11/13
 */
public class AdapterTest {

    @Test
    public void targetRequestIsNormalRequest(){
        Target target = new Target();
        assertEquals("normal request", target.request());
    }

    @Test
    public void adapteeRequestIsSpecificRequest(){
        Adaptee adaptee = new Adaptee();
        assertEquals("specific request", adaptee.specificRequest());
    }

    @Test
    public void adapterRequestIsSpecificRequest(){
        Adapter adapter = new Adapter();
        assertEquals("specific request", adapter.request());
    }

    @Test
    public void targetRequestIsSpecificRequest(){
        Target target = new Adapter();
        assertEquals("specific request", target.request());
    }
}
