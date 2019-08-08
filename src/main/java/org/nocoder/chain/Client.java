package org.nocoder.chain;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandlerA();
        Handler h2 = new ConcreteHandlerB();

        h1.setSuccessor(h2);

        int[] requests = new int[]{9, 19, 7};

        for (int request : requests) {
            h1.handleRequest(request);
        }
    }
}

