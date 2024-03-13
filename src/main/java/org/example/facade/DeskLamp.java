package org.example.facade;

public class DeskLamp implements Device {
    @Override
    public void off() {
        System.out.println("DeskLamp is turned off.");
    }
}
