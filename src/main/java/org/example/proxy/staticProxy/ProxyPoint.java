package org.example.proxy.staticProxy;

public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();
    @Override
    public void sellTickets() {
        System.out.println("...");
        trainStation.sellTickets();
    }
}
