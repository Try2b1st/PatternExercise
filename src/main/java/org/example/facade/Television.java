package org.example.facade;

public class Television implements Device {
    @Override
    public void off() {
        System.out.println("Television is turned off.");
    }
}
