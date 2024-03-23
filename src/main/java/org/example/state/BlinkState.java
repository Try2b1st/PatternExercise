package org.example.state;

public class BlinkState implements State {
    @Override
    public void handle() {
        System.out.println("Light is blink");
    }
}
