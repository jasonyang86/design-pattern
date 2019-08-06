package org.nocoder.proxy;

/**
 * Proxy Client
 * @author jason
 */
public class Client {
    public static void main(String[] args) {
        RealSubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);
        proxy.request();
    }
}
