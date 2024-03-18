package org.example.command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private Command command;

    private List<Command> list = new ArrayList<>();

    public RemoteControl(Command command) {
        this.command = command;
    }

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        list.add(command);
        command.execute();
    }

    public void redo(){
        Command tempCommand = list.get(list.size() - 1);
        tempCommand.execute();
    }
}
