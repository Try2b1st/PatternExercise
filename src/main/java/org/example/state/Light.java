package org.example.state;

public class Light {
    private State currentState;

    public Light() {
        this.currentState = new OffState();
    }

    public void setCurrentState(State state){
        this.currentState = state;
    }

    public void request(){
        currentState.handle();
    }
}
