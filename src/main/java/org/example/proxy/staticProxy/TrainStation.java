package org.example.proxy.staticProxy;

public class TrainStation implements SellTickets{
    @Override
    public void sellTickets() {
        System.out.println("火车站卖票");
    }
}
