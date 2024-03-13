package org.example.briage;

public class BasicRemoteControl extends RemoteControl{
    public BasicRemoteControl(TV tv) {
        super(tv);
    }

    @Override
    void turnOn() {
        tv.on();
    }

    @Override
    void turnOff() {
        tv.off();
    }

    @Override
    void changeChannel() {
        tv.tuneChannel();
    }
}
