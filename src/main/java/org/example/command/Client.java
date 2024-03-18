package org.example.command;

public class Client {
    public static void main(String[] args) {
        Device device1 = new Device("TV");
        Device device2 = new Device("Stereo");

        TurnOffCommand turnOffCommand = new TurnOffCommand();
        turnOffCommand.setDevice(device1);

        TurnOnCommand turnOnCommand = new TurnOnCommand();
        turnOnCommand.setDevice(device2);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();

        remoteControl.redo();

    }
}
