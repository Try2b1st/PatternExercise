package org.example.command;

public class TurnOnCommand implements Command {

    private Device device;

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
