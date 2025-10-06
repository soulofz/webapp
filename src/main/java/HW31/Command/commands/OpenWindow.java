package HW31.Command.commands;

import HW31.Command.model.Door;
import HW31.Command.model.Window;

public class OpenWindow implements Command {
    private Window window;

    public OpenWindow() {
        window = new Window();
    }

    @Override
    public void execute() {
        window.open();
    }
}
