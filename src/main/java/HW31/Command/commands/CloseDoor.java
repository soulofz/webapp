package HW31.Command.commands;

import HW31.Command.model.Door;

public class CloseDoor implements Command {
    private Door door;

    public CloseDoor() {
        door = new Door();
    }

    @Override
    public void execute() {
        door.close();
    }
}
