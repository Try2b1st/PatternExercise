package org.example.briage;

public class Client {
    public static void main(String[] args) {
        TV atv = new TVImpl();
        TV btv = new TVImpl();

        RemoteControl remoteControlA = new BasicRemoteControl(atv);
        RemoteControl remoteControlB = new BasicRemoteControl(btv);

        remoteControlA.turnOn();
        remoteControlA.turnOff();
        remoteControlA.changeChannel();

        remoteControlB.turnOn();
        remoteControlB.turnOff();
        remoteControlB.changeChannel();
    }
}
