package org.example.state;

public class OnState implements State {
    @Override
    public void handle() {
        System.out.println("Light is On");
    }
}
