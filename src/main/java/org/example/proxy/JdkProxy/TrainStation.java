package org.example.proxy.JdkProxy;

public class TrainStation implements SellTickets{
    @Override
    public void sellTickets() {
        System.out.println("火车站卖票");
    }
}