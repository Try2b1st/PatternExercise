package org.example.facade;

public class AirConditioner implements Device {
    @Override
    public void off() {
        System.out.println("Air Conditioner is turned off.");
    }
}
