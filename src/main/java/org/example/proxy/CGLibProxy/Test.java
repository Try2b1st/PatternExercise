package org.example.proxy.CGLibProxy;

public class Test {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();

        TrainStation proxy = proxyFactory.getProxy();

        proxy.sell();
    }
}
