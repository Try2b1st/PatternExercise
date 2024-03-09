package org.example.proxy.JdkProxy;

public class Test {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();

        SellTickets sellTickets = proxyFactory.getProxyObject();

        sellTickets.sellTickets();
    }
}
