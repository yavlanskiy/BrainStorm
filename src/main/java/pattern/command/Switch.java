package pattern.command;

import java.util.HashMap;

public class Switch {
    private final HashMap<String, Command> commandMap = new HashMap<>();

    public Switch() {
        addCommand();
    }

    private void addCommand(){
        register("on", new SwitchOnCommand());
        register("off", new SwitchOffCommand());
    }

    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName, Liqht light) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute(light);
    }
}
