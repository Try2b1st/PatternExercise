package org.example.state;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();

        light.request();

        light.setCurrentState(new OnState());
        light.request();

        light.setCurrentState(new BlinkState());
        light.request();
    }
}
