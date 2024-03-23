package org.example.state;

public class OffState implements State {
    @Override
    public void handle() {
        System.out.println("Light is Off");
    }
}
