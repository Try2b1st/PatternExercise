package org.example.command;

public class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public void turnOff(){
        System.out.println(name + "turnOff");
    }

    public void turnOn(){
        System.out.println(name + "turnOn");
    }
}
