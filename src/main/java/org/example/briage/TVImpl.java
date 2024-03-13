package org.example.briage;

public class TVImpl implements TV{

    @Override
    public void on() {
        System.out.println("TV is ON");
    }

    @Override
    public void off() {
        System.out.println("TV is OFF");
    }

    @Override
    public void tuneChannel() {
        System.out.println("TV is tuneChannel");
    }
}
