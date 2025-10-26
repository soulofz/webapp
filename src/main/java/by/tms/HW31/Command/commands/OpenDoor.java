package by.tms.HW31.Command.commands;

import by.tms.HW31.Command.model.Door;

public class OpenDoor implements Command {
    private Door door;

    public OpenDoor() {
        door = new Door();
    }

    @Override
    public void execute() {
        door.open();
    }
}
