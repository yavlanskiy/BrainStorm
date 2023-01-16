package pattern.command;

public class SwitchOnCommand implements Command {

    @Override
    public void execute(LightImpl light) {
        light.turnOn();
    }
}
