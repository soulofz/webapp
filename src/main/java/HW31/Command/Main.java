package HW31.Command;

import HW31.Command.commands.CloseDoor;
import HW31.Command.commands.CloseWindow;
import HW31.Command.commands.OpenDoor;
import HW31.Command.commands.OpenWindow;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new OpenDoor());
        remoteControl.setCommand(new OpenWindow());
        remoteControl.setCommand(new CloseDoor());
        remoteControl.setCommand(new CloseWindow());

        remoteControl.action();
        remoteControl.action();
        remoteControl.removeNextCommand();
        remoteControl.action();
    }
}
