package HW31.Command;

import HW31.Command.commands.Command;

import java.util.ArrayDeque;

public class RemoteControl {
    private ArrayDeque<Command> queue = new ArrayDeque<>();

    public void setCommand(Command command) {
        queue.addLast(command);
    }

    public void action(){
        queue.removeFirst().execute();
    }
    public void removeNextCommand() {
        queue.removeFirst();
    }
}
