package org.nocoder.proxy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProxyTest {
    @Test
    public void test(){
        // 真实主题，被代理的对象
        RealSubject subject = new RealSubject();
        // 代理对象，代理对象可能需要做一些额外的事情，同时还要调用真实主题对象的方法
        Proxy proxy = new Proxy(subject);
        assertEquals("Proxy: real subject request", proxy.request());
    }
}
