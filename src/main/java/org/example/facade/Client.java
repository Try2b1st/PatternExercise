package org.example.facade;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        AirConditioner airConditioner = new AirConditioner();
        DeskLamp deskLamp = new DeskLamp();
        Television television = new Television();
        MasterSwitch masterSwitch = new MasterSwitch(airConditioner, deskLamp, television);
        masterSwitch.turnOff(x);
    }
}
