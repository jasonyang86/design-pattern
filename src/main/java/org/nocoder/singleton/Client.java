package org.nocoder.singleton;

/**
 * Single Object Client
 * @author jason
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
