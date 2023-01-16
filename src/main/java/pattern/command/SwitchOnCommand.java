package pattern.command;

public class SwitchOnCommand implements Command {

    @Override
    public void execute(Liqht light) {
        light.turnOn();
    }
}
