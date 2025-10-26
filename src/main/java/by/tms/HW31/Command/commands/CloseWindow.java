package by.tms.HW31.Command.commands;

import by.tms.HW31.Command.model.Window;

public class CloseWindow implements Command{
    private Window window;

    public CloseWindow() {
        window = new Window();
    }

    @Override
    public void execute() {
        window.close();
    }
}
