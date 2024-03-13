package org.example.briage;

public abstract class RemoteControl {
    protected  TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    abstract void turnOn();
    abstract void turnOff();
    abstract void changeChannel();
}
